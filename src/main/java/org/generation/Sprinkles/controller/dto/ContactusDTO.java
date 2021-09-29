package org.generation.Sprinkles.controller.dto;

public class ContactusDTO {

    private String contactname;
    private String email;
    private Integer mobilenumber;
    private String enquiry;


    public ContactusDTO(String contactname,String email, int mobilenumber, String enquiry)
    {
        this.contactname = contactname;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.enquiry = enquiry;
       }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(Integer mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }
}