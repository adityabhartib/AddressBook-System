package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts>contactsList=new ArrayList<>();
    Contacts contacts = new Contacts();
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
        contactsList.add(contacts);
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
    }
    public void displayContact() {
        if(contacts.getFirstname()==null) {
            System.out.println("No Contact Found------!!!!!!!!!");
            System.out.println("---------------------------------");
        } else{
            System.out.println("--------------------------------------------");
            System.out.println(contactsList.toString());
            System.out.println("---------------------------------------------");}
    }
    public void editContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

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
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();

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