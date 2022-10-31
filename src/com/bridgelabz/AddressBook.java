package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    int choice;
    ArrayList<Contacts>contactList=new ArrayList<Contacts>();
    public void addNewContact() {
        Contacts contacts = new Contacts();
        System.out.println("____________________________________");
        System.out.println("Enter Contact Details :-");
        System.out.println("Enter First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter City :");
        contacts.setCity(sc.next());
        System.out.println("Enter State :");
        contacts.setState(sc.next());
        System.out.println("Enter PIN Code :");
        contacts.setPin(sc.nextLong());
        System.out.println("Enter Phone Number :");
        contacts.setPhonenumber(sc.nextLong());
        System.out.println("Enter EMail ID :");
        contacts.setEmail(sc.next());
        contactList.add(contacts);
        System.out.println("Contact Added Successfully!---------");
        System.out.println("________________________________");
    }
    public void displayContact() {
        for(Contacts contact : contactList) {
            if (contact.getFirstname() == null) {
                System.out.println("Contact Details Not Available");
            } else {
                System.out.println("----------------------------------");
                System.out.println("Contact Details :-");
                System.out.println("First Name : " + contact.getFirstname());
                System.out.println("Last Name : " + contact.getLastname());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("PIN Code : " + contact.getPin());
                System.out.println("Phone Number : " + contact.getPhonenumber());
                System.out.println("EMail ID : " + contact.getEmail());
                System.out.println("----------------------------------------");
            }
        }
    }
    public void editContact() {
        System.out.println("Enter First Name : ");
        String firstName = sc.next();

        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                isAvailable = true;
                System.out.println("Enter Last Name :");
                contact.setLastname(sc.next());
                System.out.println("Enter  Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter  City :");
                contact.setCity(sc.next());
                System.out.println("Enter State :");
                contact.setState(sc.next());
                System.out.println("Enter PIN Code :");
                contact.setPin(sc.nextLong());
                System.out.println("Enter Phone Number :");
                contact.setPhonenumber(sc.nextLong());
                System.out.println("Enter EMail ID :");
                contact.setEmail(sc.next());
                System.out.println("Contact Upadate Successfully!-----------");
                break;
            }
        }
        if(!isAvailable) {
            System.out.println("Contact Not Found!----------");
        }
    }

    public void deleteContact() {
        System.out.println("Enter First Name : ");
        String firstName = sc.next();
        boolean isAvailable = false;
        for(Contacts contact : contactList) {
            if (firstName.equalsIgnoreCase(contact.getFirstname())) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact Deleted!!--------------");
                break;
            }
        }
        if(!isAvailable) {
            System.out.println("Contact Not Found.");
        }
    }

    public void contactOptions(AddressBook addressBook) {

        do {
            System.out.println("--------Welcome to Address Book Program-------");
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5. Exit");
            System.out.println("Enter Choice: ");
            choice = addressBook.sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select the Operation between 1 to 5 only.");
                    break;
            }
        }while( choice != 5 );
    }
}