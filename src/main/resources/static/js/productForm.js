
const productsControl = new ProductsController();
let storeImage = ""



//When user clicks on 'Save Item', calls API to add items to the database
//Add an 'onsubmit' event listener for productform to add a product
newItemForm.addEventListener('submit', (event) => {
    // Prevent default action
    event.preventDefault();
    // Select the inputs
    const newItemNameInput = document.querySelector('#newItemNameInput');
    const newItemCategory = document.querySelector('#newItemCategory');
    const newItemPrice = document.querySelector('#newItemPrice');
    const newItemDescription = document.querySelector('#newItemDescription');
    const newItemImageUrl = document.querySelector('#newItemImageFile');

//newItemCategory.value = 'cake';

    // Get the values of the inputs - variable names to be same as MySQL columns
    const name = newItemNameInput.value;
    const category = newItemCategory.value;
    const price = newItemPrice.value;
    const description = newItemDescription.value;
    const imageUrl = "images/" + newItemImageUrl.value.replace("C:\\fakepath\\", "");

 // Add the task to the task manager
    productsControl.addItem(name, category, price, description, imageUrl, storeImage);

    // Clear the form
    newItemNameInput.value = '';
    //newItemCategory.value = '';
    newItemPrice.value = '';
    newItemDescription.value = '';
    newItemImageUrl.value = '';

});

// select file input
const input = document.querySelector('#newItemImageFile');

// add event listener
input.addEventListener('change', () => {
//File object representing the file(s) selected by the user
    storeImage = input.files[0];
});