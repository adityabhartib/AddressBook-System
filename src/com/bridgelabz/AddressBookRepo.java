package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookRepo {
    Map<String,
            AddressBook> addressBookMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public  void addNewAddressBook() {
        System.out.println("Enter the Address Book Name :");
        String addressbookName =sc.next();
        if (checkAddressBook(addressbookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(addressbookName, addressBook);
        }
    }

    public  void displayAddressBooks() {
        for (String key : addressBookMap.keySet()) {
            System.out.println(key);
        }
    }

    public boolean checkAddressBook(String addressbookName) {
        for (String key : addressBookMap.keySet()) {
            if (addressbookName.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    public  void selectAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName =sc.next();
        if (checkAddressBook(addressbookName)) {
            addressBookMap.get(addressbookName).contactOptions(addressBookMap.get(addressbookName));
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public void editAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (checkAddressBook(addressbookName)) {
//            System.out.println("Enter the New Name for Addressbook :");
//            String newName = sc.next();
//            addressBookMap.;
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String addressbookName = sc.next();
        if (checkAddressBook(addressbookName)) {
            addressBookMap.remove(addressbookName);
            System.out.println("Address Book is Deleted");
        } else {
            System.out.println("Entered Address Book Name is Invalid");
        }
    }

    public final int userInput() {
        return sc.nextInt();
    }

}