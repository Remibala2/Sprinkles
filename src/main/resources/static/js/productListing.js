//To create an instance of ProductsController Class
const productsControl = new ProductsController();


function loadData()
{
    productsControl.displayItem();
}
loadData();


/*
//When user click on the dropdown list from the filter
function filterData()
{
    var myValue = document.getElementById("category").value;
    productsControl.displayItem(myValue);
    console.log("filter : " + myValue);
}*/