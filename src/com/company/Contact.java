package com.company;

public class Contact {
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String name;
    private String phoneNumber;

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
