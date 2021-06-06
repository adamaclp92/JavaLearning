package mobilephone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private static MobilPhone phone = new MobilPhone();

    public static void main(String[] args) {

       /* phone.addContact("Ádám", "06304631698");
        phone.addContact("Béla", "06204132698");
        phone.addContact("Kata", "06304123198");
        phone.addContact("Kata", "06304123198");
        phone.addContact("Kata", "06304123198");
        phone.addContact("Kata", "06304123198");
        phone.printContacts();
        System.out.println();
        phone.updateContact("Kata", "Lajos", "1231232121");
        phone.updateContact("Kata", "Lajos", "1231232121");
        phone.updateContact("Ádám", "Lajos", "1231232121");
        phone.printContacts();
        System.out.println();
        phone.removeContact("Béla");
        phone.removeContact("Béla");
        phone.printContacts();
        System.out.println();
        System.out.println(phone.searchContact("Ádám"));
        System.out.println(phone.searchContact("Béla"));*/

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the contact list.");
        System.out.println("\t 3 - To modify a contact in the contact list.");
        System.out.println("\t 4 - To remove a contact from the contact list.");
        System.out.println("\t 5 - To search for a contact in the contact list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String number = scanner.nextLine();
        phone.addContact(name, number);
    }

    public static void modifyContact(){
        System.out.println("Enter the old name:");
        String oldName = scanner.nextLine();
        System.out.println("Enter the new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter the new phone number:");
        String number = scanner.nextLine();
        phone.updateContact(oldName, newName, number);
    }

    public static void removeContact(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        phone.removeContact(name);
    }

    public static void searchContact(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        if(phone.searchContact(name))
            System.out.println("The contact is exists.");
        else
            System.out.println("The contact doesn't exists.");
    }

}
