/*const contactformList = [];

function  contactaddForm() {
    
    let contact_name = document.querySelector("#contact_name").value;
    let contact_email = document.querySelector("#contact_email").value;
    let contact_mobile = document.querySelector("#contact_mobile").value;
    let contact_enquiry = document.querySelector("#contact_enquiry").value;
  
      addToListEnquiry(contact_name, contact_email, contact_mobile, contact_enquiry);
    }

    function addToListEnquiry (contact_name, contact_email, contact_mobile, contact_enquiry) {
        //just adding the list of item in to the array , and push the array to formList object
        //item object that contain one set of property and value of the inputs
        const contactitem = {
            contact_name: contact_name,
            contact_email: contact_email,
            contact_mobile: contact_mobile,
            contact_enquiry: contact_enquiry    
    
        }
        contactformList.push(contactitem);
        console.log(contactformList);
    
        //call the API that created by you in the backend to send the data back and store into the
        
        
        // clear the form for the next input
        clearEnquiryForm();
        console.log(`Total Submission: ${contactformList.length}`.contactformList);
    
    }

    function clearEnquiryForm() {
        document.querySelector("#contact_name").value = "";
        document.querySelector("#contact_email").value = "" ;
        document.querySelector("#contact_mobile").value = "";
        document.querySelector("#contact_enquiry").value = "";
        
    }


function displayProductDetails(item)
{
    document.querySelector(".contact_name").innerText = item.name;
    document.querySelector("#modalCategory").innerText = item.category;
        document.querySelector("#modalPrice").innerText = item.price;
        document.querySelector("#modalDescription").innerText = item.description;
    document.querySelector("#modalImg").src = item.imageUrl;
}

class ProductsController
{
    constructor()
    {
        this._enquiry = [];       //create an array to store the details of product items
    }

    //method to add the items into the array
    addToListEnquiry(contactname, category, price, description, imageUrl)
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

       fetch('http://localhost:8080/item/add',{
       //fetch('https://rbwebproject.herokuapp.com/item/add',{

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
    */
