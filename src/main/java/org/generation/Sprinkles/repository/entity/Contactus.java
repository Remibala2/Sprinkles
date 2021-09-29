package org.generation.Sprinkles.repository.entity;


import org.generation.Sprinkles.controller.dto.ContactusDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Repository is the model layer
//JPA (Java Persistence API) map Java Objects (Class) to the database tables
//This concept is known as ORM(Object Relational Mapping)
//Item is an entity that will be used to map with the Item table in the database
//E.g if you have a category table, then you have to create another entity
//1 table = 1 entity

@Entity
public class Contactus {
    //Table columns is the item attributes of the class
    //Database is responsible for auto generating the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enquiryid;
    private String contactname;
    private String email;
    private Integer mobilenumber;
    private String enquiry;


    public Contactus() {
    }

    public Contactus(ContactusDTO contactusDTO) {
        this.contactname = contactusDTO.getContactname();
        this.email = contactusDTO.getEmail();
        this.mobilenumber = contactusDTO.getMobilenumber();
        this.enquiry = contactusDTO.getEnquiry();
    }

    public Integer getEnquiryid() {
        return enquiryid;
    }

    public void setEnquiryid(Integer enquiryid) {
        this.enquiryid = enquiryid;
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

    @Override
    public String toString() {
        return "Contactus{" +
                "enquiryid=" + enquiryid +
                ", contactname='" + contactname + '\'' +
                ", email='" + email + '\'' +
                ", mobilenumber=" + mobilenumber +
                ", enquiry='" + enquiry + '\'' +
                '}';
    }
}
