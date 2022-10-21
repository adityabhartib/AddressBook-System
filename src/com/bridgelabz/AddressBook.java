package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    //Scanner object for User Input
    Scanner sc = new Scanner(System.in);

    //Created Contacts Object for Getter and Setter Methods
    Contacts contacts = new Contacts();

    //Method to Add New Contact to AddressBook
    public void addNewContact() {
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setCity(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the PIN Code :");
        contacts.setPin(sc.nextLong());
        System.out.println("Enter the Phone Number :");
        contacts.setPhonenumber(sc.nextLong());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
    }

    //Method to Show the Contact Details
    public void displayContact() {
        if(contacts.getFirstname()==null) {
            System.out.println("No Contact Found------!!!!!!!!!");
            System.out.println("---------------------------------");
        } else{
        System.out.println("--------------------------------------------");
        System.out.println("Contact Details :-");
        System.out.println("Name : "+contacts.getFirstname()+" "+contacts.getLastname());
        System.out.println("Address : "+contacts.getAddress());
        System.out.println("City : "+contacts.getCity());
        System.out.println("State : "+contacts.getState());
        System.out.println("PIN Code : "+contacts.getPin());
        System.out.println("Phone Number : "+contacts.getPhonenumber());
        System.out.println("EMail ID : "+contacts.getEmail());
        System.out.println("---------------------------------------------");}
    }
    //Method to Edit the Existing Contact
    public void editContact() {
        //Get First Name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        if(!firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            contacts.setFirstname(sc.next());
            System.out.println("Enter the Last Name :");
            contacts.setLastname(sc.next());
            System.out.println("Enter the Address :");
            contacts.setAddress(sc.next());
            System.out.println("Enter the City :");
            contacts.setCity(sc.next());
            System.out.println("Enter the State :");
            contacts.setState(sc.next());
            System.out.println("Enter the Zip Code :");
            contacts.setPin(sc.nextLong());
            System.out.println("Enter the Phone Number :");
            contacts.setPhonenumber(sc.nextLong());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
        }
    }
    public void deleteContact(){
        //Get First Name to Delete the Contact
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

        //check if the Given User with First Name
        if(!firstName.equalsIgnoreCase(contacts.getFirstname())) {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        } else {
            contacts.setFirstname(null);
            contacts.setLastname(null);
            contacts.setAddress(null);
            contacts.setCity(null);
            contacts.setState(null);
            contacts.setPin(0);
            contacts.setPhonenumber(0);
            contacts.setEmail(null);
            System.out.println("Contact Deleted Successfully-------!!!");
        }
    }
}