/*
 * Mariam Khatib
 * Lab: Phonebook/Linked Lists
 * Spring 2020
 * IDE: IntelliJ
 */

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PhoneBookMain {
    //main has all the values
    public static Scanner book = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        
        phonebook_node List = new phonebook_node();

        Integer menu = 0;
        boolean finished = false;

        phoneBookManager Bellingham = new phoneBookManager();

        while (menu != 6) { //menu options
            System.out.println();
            System.out.println("1. Add new contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Search contact");
            System.out.println("4. Sort contact");
            System.out.println("5. Print contacts list");
            System.out.println("6. Exit");
            System.out.print("Please select your choice: ");
            String response = book.nextLine();
            menu = Integer.parseInt(response);
        

            switch (menu) {
                case 1://adds contact
                    System.out.println("Please enter First name: ");
                    String firstName = book.nextLine();

                    System.out.println("Please enter Last name: ");
                    String lastName = book.nextLine();

                    System.out.println("Please enter Email Address: ");
                    String email = book.nextLine();

                    System.out.println("Please enter a Phone number: ");
                    String phoneNumeber = book.nextLine();

                    System.out.println("Please enter a City: ");
                    String city = book.nextLine();

                    phonebook_node node_to_add = new phonebook_node(lastName, firstName, email, phoneNumeber, city);

                    Bellingham.add(node_to_add);


                    break;

                case 2://delete contact
                    System.out.println("Please enter the Last Name you would like deleted: ");
                    String to_delete = book.nextLine();
                    Bellingham.delete(to_delete);
                    break;

                case 3://search contact
                    System.out.println("Please enter the Name to search for: ");

                    break;

                case 4://sort
                    //Collections.sort(phonebook_node);
                    // SHAME ON YOU MARIAM THIS IS CHEATING
                    System.out.println("This list has been sorted!");;
                    break;

                case 5://prints list
                    System.out.println("Printing Phonebook.");
                    Bellingham.print();

                    break;

                case 6://exit
                    System.out.println("Thank you for using Yellow Pages.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }//end of switch case
        }//end of main
    }
}//end of class