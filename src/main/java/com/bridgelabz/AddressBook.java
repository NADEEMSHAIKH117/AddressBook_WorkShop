package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	    static ContactDetails person = new ContactDetails(null, null, null, null, null, 0, 0, null);
	    static List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
	    Scanner scanner = new Scanner(System.in);
	    
	    
	   public void addContact() {
	        System.out.println("Enter First Name : ");
	        String firstName = scanner.next();
	        System.out.println("Enter Last Name : ");
	        String lastName = scanner.next();
	        System.out.println("Enter Address : ");
	        String address = scanner.next();
	        System.out.println("Enter City : ");
	        String city = scanner.next();
	        System.out.println("Enter State : ");
	        String state = scanner.next();
	        System.out.println("Enter ZipCode : ");
	        int zipCode = scanner.nextInt();
	        System.out.println("Enter Mobile Number : ");
	        long mobileNumber = scanner.nextLong();
	        System.out.println("Enter EmailId : ");
	        String emailId = scanner.next();
	        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
	        contactDetailsList.add(person);
	        printContact();
	    }
	   
	   public void editContact() {
	        System.out.println("Enter the first name of person to edit contact");
	        String firstName = scanner.next();
	        if (firstName.equalsIgnoreCase(person.getFirstName())) {
	            addContact();
	        } else {
	            System.out.println("The Entered First Name Is Not Match");
	            editContact();
	        }
	    }
	   
	   public void deleteContact() {
	        System.out.println("Enter the first name of person to delete contact");
	        String deleteName = scanner.next();
	        if (deleteName.equalsIgnoreCase(person.getFirstName())) {
	            System.out.println("Deleted " + person.getFirstName() + " details");
	            person = null;
	        } else {
	            System.out.println("The Entered First Name Is Not Match");
	            deleteContact();
	        }
	    }
	  
	    public static void printContact() {
	        for (int i = 0; i < contactDetailsList.size(); i++) {
	             person = contactDetailsList.get(i);
	            System.out.println("Contact Details");
	            System.out.println("Name         : " + person.getFirstName() + " " + person.getLastName() + "\n"
	                             + "Address      : " + person.getAddress()   + "\n"
	                             + "City         : " + person.getCity()      + "\n"
	                             + "State        : " + person.getState()     + "\n"
	                             + "ZipCode      : " + person.getZipCode()   + "\n"
	                             + "MobileNumber : " + person.getMobileNumber()  + "\n"
	                             + "EmailId      : " + person.getEmailId()   + "\n");
	        }
	    }

}
