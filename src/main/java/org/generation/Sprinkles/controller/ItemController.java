package org.generation.Sprinkles.controller;


//import org.generation.Sprinkles.component.FileUploadUtil;
import org.generation.Sprinkles.component.FileUploadUtil;
import org.generation.Sprinkles.controller.dto.ItemDTO;
import org.generation.Sprinkles.repository.entity.*;
import org.generation.Sprinkles.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/item")

public class ItemController {

    final ItemService itemService;
//Autowired will implicit inject the ItemServices as a dependency to ItemController
    //so that we can call the methods in the ItemService

    @Value("${image.folder}")
    private String imageFolder;

    public ItemController(@Autowired ItemService itemService)
    {
        this.itemService = itemService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Item> getItems()
    {
        return itemService.all();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Item findItemById(@PathVariable Integer id)
    {
        return itemService.findById(id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id)
    {
        itemService.delete(id);
    }

    @CrossOrigin
    @PostMapping("/add")
    public Item save(  @RequestParam(name="name", required = true) String name,
                       @RequestParam(name="category", required = true) String category,
                       @RequestParam(name="price", required = true) double price,
                       @RequestParam(name="description", required = true) String description,
                       @RequestParam(name="imageUrl", required = true) String imageUrl,
                       @RequestParam("imagefile") MultipartFile multipartFile) throws IOException {

           //  String uploadDir1 = "productImages/images";
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        FileUploadUtil.saveFile(imageFolder, fileName, multipartFile);

        ItemDTO itemDto = new ItemDTO(name, category,price,description, imageUrl);
        return itemService.save(new Item(itemDto));
    }

}
