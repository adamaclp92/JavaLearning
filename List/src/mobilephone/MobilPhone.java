package mobilephone;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilPhone {

    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private ArrayList<String> contactNames = new ArrayList<String>();

    public void printContacts(){
        System.out.println("The contact list:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).getName() + " - " + contacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber){
        if(contactNames.contains(name))
            System.out.println("This name (" + name + ") is already exist in the contacts.");
        else {
            Contacts newContact = new Contacts(name, phoneNumber);
            contacts.add(newContact);
            contactNames.add(name);
            System.out.println(name + " - " + phoneNumber + " succesfully added to contacts.");
        }
    }

    public void updateContact(String oldName, String newName, String newPhoneNumber){
        int oldPlace = findContact(oldName);
        if(oldPlace >= 0){
            if(contactNames.contains(newName)){
                System.out.println("The new name (" + newName + ") is already exist in the contacts.");
            }else{
                Contacts newContact = new Contacts(newName, newPhoneNumber);
                contacts.set(oldPlace, newContact);
                contactNames.set(oldPlace, newName);
                System.out.println(newName + " - " + newPhoneNumber + " succesfully updated.");
            }
        }else{
            System.out.println("The updateable contact (" + oldName + ") doesn't exist in the contacts.");
        }
    }

    private int findContact(String name){
        return contactNames.indexOf(name);
    }

    public void removeContact(String name){
        int contactIndex = findContact(name);
        if(contactNames.contains(name)){
            contacts.remove(contactIndex);
            contactNames.remove(contactIndex);
            System.out.println(name + " succesfully removed from contacts.");
        }else{
            System.out.println("The deletable contact (" + name + ") doesn't exist in the contacts.");
        }
    }

    public boolean searchContact(String name){
        if(findContact(name) >= 0)
            return true;
        else
            return false;
    }
}
