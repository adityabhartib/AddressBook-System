package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    ArrayList<Contacts>list = new ArrayList<>();

    public void addNewContact() {
        Contacts contacts=new Contacts();
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
        contacts.setPin(sc.next());
        System.out.println("Enter the Phone Number :");
        contacts.setPhonenumber(sc.next());
        System.out.println("Enter the EMail ID :");
        contacts.setEmail(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
        list.add(contacts);
    }

    public void displayContact() {
        for (Contacts cont:list) {
            System.out.println(cont);
        }
    }

    public void editContact() {
        Contacts contacts=new Contacts();
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (list.contains(firstName)) {
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
            System.out.println("Enter the PIN Code :");
            contacts.setPin(sc.next());
            System.out.println("Enter the Phone Number :");
            contacts.setPhonenumber(sc.next());
            System.out.println("Enter the EMail ID :");
            contacts.setEmail(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
            list.add(contacts);
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (list.contains(firstName)) {
            list.remove(firstName);
            System.out.println("Contact Deleted Successfully-------!!!");

        }
    }
}