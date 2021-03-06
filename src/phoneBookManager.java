/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 *IDE: IntelliJ
 */


import java.util.Collection;
import java.util.Collections;

public class phoneBookManager {
    //needs to add an entry (name, address, city, phone #) to the end and then sort it, or alphabetically by last name
    //modify the entry, delete entries, or move them from the Bellingham to the Seattle phone book (optional)
    //print out your list in a nice format


    private phonebook_node start;
    private int size;

    public phoneBookManager(){ //creates an empty node
        start = null;

    }


    public void add(phonebook_node node){

        phonebook_node current;

        if(start == null){
            start = node;

        }else{
            boolean found = false;
            current = start;
            while(current.next != null && !found){
                    if((current.getLastName().charAt(0) < node.getLastName().charAt(0) &&
                            (node.getLastName().charAt(0) <= current.getLastName().charAt(0)))){
                        found = true;

                    }else if(current.next == null){
                        current.next = node;

                    }else{
                        current = current.next;

                        if(current.next != null){
                            node.next = current.next;
                            current.next = node;
                        }
                    }
            }
            current.next = node;
        }

        System.out.println();

    }

    public void delete(String to_delete) {
        phonebook_node current;
        boolean search = false;
        if (start == null) {
            System.out.println("There's nothing here, just blankness.");

        } else if (start.getLastName().equalsIgnoreCase(to_delete)) {
            start = start.next;
        } else {
            current = start;
            while (current.next != null && !search) {
                if (start.getLastName().equalsIgnoreCase(to_delete)) {
                    System.out.println(current.next.getLastName() + " has been deleted.");
                    current = current.next.next;
                    search = true;

                } else {
                    current = current.next;
                }
                if (!search) {
                    System.out.println(to_delete + " could not be found.");
                }
                System.out.println();
            }
        }
    }


    public void searchName(String to_search){

        phonebook_node current;
        boolean search = false;
        if (start == null) {
            System.out.println("There's nothing here, just blankness.");

        } else if (start.getLastName().equalsIgnoreCase(to_search)) {
            System.out.println(start);
        } else {
            current = start;
            while (current.next != null && !search) {
                if (start.getLastName().equalsIgnoreCase(to_search)) {
                    System.out.println(current.next.getLastName() + " has been found.");
                    current = current.next.next;
                    search = true;
                } else {
                    current = current.next;
                }
                if (!search) {
                    System.out.println(to_search + " could not be found.");
                }
                System.out.println();
            }
        }

    }


    public void print(){
        phonebook_node current = null;
        if(start == null){
            System.out.println("This list is empty.");

        }else{
            current = start;
            System.out.println(current.toString());

           while(current.next != null){

               current = current.next;
               System.out.println(current.toString());

           }

        }
        System.out.println();
    }

}//end of manager
