//Doing a Product web app, in product page to
//display the name, description, imageUrl, style, price, ..., ...,.....,....


const createHTMLList = (index, name, description, imageURL) =>
`
<div class="col-12 col-md-6 col-lg-3 mb-4">
<div class="card" style="width: 20rem;">
    <img src=${imageURL} class="card-img-top"
        alt="image">
    <div class="card-body">
        <h5 class="card-title">${name}</h5>
     <p class="card-text-price">$${price.toFixed(2)}</p>

        <a id="${index}" href="#" class="btn btn-info btn-lg" data-toggle="modal" data-target="#productModal">Read More</a>
    </div>
</div>
</div>
`;

function displayProductDetails(item)
{
    document.querySelector("#modalName").innerText = item.name;
    document.querySelector("#modalCategory").innerText = item.category;
        document.querySelector("#modalPrice").innerText = item.price;
        document.querySelector("#modalDescription").innerText = item.description;
    document.querySelector("#modalImg").src = item.imageUrl;
}

class ProductsController
{
    constructor()
    {
        this._items = [];       //create an array to store the details of product items
    }

    //method to add the items into the array
    addItem(name, category, price, description, imageUrl)
    {
        const itemObj = {
            oName: name,
            oCategory: category,
            oPrice: price,
            oDescription: description,
            oImageUrl: imageUrl
        };

        this._items.push(itemObj);
    }

    addItem(name, category, price, description, imageUrl, imageObject)
    {
       var productController = this;
       const formData = new FormData();
       formData.append('name', name);
       formData.append('category', category);
       formData.append('price', price);
       formData.append('description', description);
       formData.append('imageUrl', imageUrl);
       formData.append('imagefile',imageObject);

     //  fetch('http://localhost:8080/item/add',{
       fetch('https://sprinklesproject.herokuapp.com/item/add',{

         method: 'POST',
         body: formData
         })
        .then(response => response.json())
        .then(data => {
        console.log('Success:', data);
        alert("Successfully added to Product")
        })
        .catch((error) => {
        console.error('Error:', error);
        alert("Error adding item to Product")
        });
    }

    displayItem()
    {
    var productController = this;
            productController._items = [];
console.log("Display");
            //fetch data from database using the REST API endpoint from Spring Boot
           // fetch('http://127.0.0.1:8080/item/all')
          fetch('https://sprinklesproject.herokuapp.com/item/all')
                .then((resp) => resp.json())
                .then(function(data) {
                    console.log("2. receive data")
                    console.log(data);
                    data.forEach(function (item, index) {

                        const itemObj = {
                            id: item.id,
                             name: item.name,
                            category: item.category,
                            price: item.price,
                            description: item.description,
                            imageUrl: item.imageUrl
                            };
                        productController._items.push(itemObj);
                  });

                  productController.renderProductPage();

                })
                .catch(function(error) {
                    console.log(error);
                });

    }
    renderProductPage()
    {
        var productHTMLList = [];
         var temp = []; // create new array for the filter

        for (var i=0; i<this._items.length; i++)
        {
            const item = this._items[i];            //assign the individual item to the variable
            const productHTML = createHTMLList(i, item.name, item.description, item.imageUrl);

            productHTMLList.push(productHTML);
        }

        //Join all the elements/items in my productHTMLList array into one string, and seperate by a break
        const pHTML = productHTMLList.join('\n');
        document.querySelector('#row').innerHTML = pHTML;


        //addEventListener - click
        for (var i=0; i<this._items.length; i++)
        {
            const item = this._items[i];
            document.getElementById(i).addEventListener("click", function() { displayProductDetails(item);} );
        }
    }
}   //End of ProductsController class
