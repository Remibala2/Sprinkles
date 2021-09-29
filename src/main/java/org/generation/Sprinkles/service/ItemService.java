package org.generation.Sprinkles.service;

import org.generation.Sprinkles.repository.entity.*;

import java.util.List;

public interface ItemService {

    //Create methods/actions that you want to do with the item
    //Controller layer will call respective methods to perform the necessary task
    // that is requested by the client(browser)


    Item save(Item item);

    void delete(int itemId);

    List<Item> all();

    Item findById(int itemId);

}
