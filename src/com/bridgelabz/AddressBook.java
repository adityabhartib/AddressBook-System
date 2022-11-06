package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> newlist = new ArrayList<>();

    public void addNewContact() {
        System.out.println("----------------------------------");
        System.out.println("Enter the Contact Details :-");
        System.out.println("Enter the First Name :");
        newlist.add(sc.next());
        System.out.println("Enter the Last Name :");
        newlist.add(sc.next());
        System.out.println("Enter the Address :");
        newlist.add(sc.next());
        System.out.println("Enter the City :");
        newlist.add(sc.next());
        System.out.println("Enter the State :");
        newlist.add(sc.next());
        System.out.println("Enter the PIN Code :");
        newlist.add(sc.next());
        System.out.println("Enter the Phone Number :");
        newlist.add(sc.next());
        System.out.println("Enter the EMail ID :");
        newlist.add(sc.next());
        System.out.println("Contacts Added Successfully------!!!");
        System.out.println("-----------------------------------------");
    }

    public void displayContact() {
        System.out.println(newlist);
    }

    public void editContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (newlist.contains(firstName)) {
            System.out.println("Match Found--------!!!!");
            System.out.println("-----------------------");
            System.out.println("Enter the First Name :");
            newlist.add(sc.next());
            System.out.println("Enter the Last Name :");
            newlist.add(sc.next());
            System.out.println("Enter the Address :");
            newlist.add(sc.next());
            System.out.println("Enter the City :");
            newlist.add(sc.next());
            System.out.println("Enter the State :");
            newlist.add(sc.next());
            System.out.println("Enter the PIN Code :");
            newlist.add(sc.next());
            System.out.println("Enter the Phone Number :");
            newlist.add(sc.next());
            System.out.println("Enter the EMail ID :");
            newlist.add(sc.next());
            System.out.println("-------------------------------");
            System.out.println("Contact Update Successfully-----!!");
        } else {
            System.out.println("The Entered Contact Name is Not Available in Address Book");
        }
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "newlist=" + newlist +
                '}';
    }

    public void deleteContact() {
        System.out.println("Enter the First Name : ");
        String firstName = sc.next();
        if (newlist.contains(firstName)) {
            newlist.remove(firstName);
            System.out.println("Contact Deleted Successfully-------!!!");

        }
    }
}