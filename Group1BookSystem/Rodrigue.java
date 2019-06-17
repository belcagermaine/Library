//@Version June 1st. 2019
//@Author Rodrigue.

import User.*;
import Book.*;
import admin.*;
import member.*;
import adresse.*;
import librarian.*;
import BookHandler.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Rodrigue { 

public static void main(String args[]){

        Address ad = new Address(12, "Douala", "Kmer");
        Member usr = new Member ("Armand", "Two", "Member", 111, ad);
        Admin adm = new Admin ("Stephens", "Three", "Admin", 123, ad);
        Librarian lib = new Librarian ("Rodriguo", "Two", "Member", 111, ad);
        Book Book1 = new Book("L'Urgence de la pensee", "Maurice Kamto", "124EBN125", false);
        Book Book2 = new Book("Starting Out with Java", "Tony Gaddis", "0133957055", false);
        //BookHandler bh = new BookHandler();
        User rmlib = new User("Rodrigue", "One", "Librarian");
        User nwlib = new User("Daphney", "Four", "Librarian");
        //boolean flag = lib1.login();
        boolean flag = adm.login();
        //System.out.println(flag);
        Scanner keyboard = new Scanner(System.in); 

        if(!flag){
                System.out.println("login or password is incorrect");
                }else{
                    if(adm.getRole()=="Librarian"){
                     System.out.println("I'm Librarian");
                     char exit = 'N';
                     while (exit != 'Y') {
                     System.out.println("Welcome "+usr.getUsername()+", what would you like to do today ?");
                     System.out.println("\t1. Add a book to the system.");
                     System.out.println("\t2. Search a book from the system.");
                     System.out.println("\t3. Issue a book to a member.");
                     System.out.println("\t4. Remove a book from the system.");
                     System.out.println("\t5. Logout.");
                     System.out.print("Enter the number that applies: ");
                     int choice = keyboard.nextInt();
                     keyboard.nextLine();
                     // Determine which command was selected.
                     switch (choice) {
                     case 1: // 1. Add a book to the system.
                     Book1.addNewBook(Book1);
                     Book2.addNewBook(Book2);
                     break;
                     case 2: // 2. Search a book from the system.
                     Book2.searchBook(Book2.getTitle());
                     break;
                     case 3: // 2. Issue a book to a member.
                     //Book1.IssueBook(Book1);
                     case 4: // 2. Search a book from the system.
                     Book1.delBook(Book1);
                     break;
                     case 5: // 5. logout the system.
                     usr.logout();
                     break;
                     default: // Invalid command
                     System.out.println("That is not a valid command.");
                     }
                     System.out.print("Would you like to exit, Y or N: ");
                     exit = keyboard.nextLine().charAt(0);
                     }
                     }else if(adm.getRole()=="Admin"){
                           System.out.println("I'm Admin");
                           char exit = 'N';
                           while (exit != 'Y') {
                           System.out.println("Welcome "+usr.getUsername()+", what would you like to do today ?");
                           System.out.println("\t1. Add a Librarian.");
                           System.out.println("\t2. Delete a Librarian.");
                           System.out.println("\t3. Logout.");
                           System.out.print("Enter the number that applies: ");
                           int choice = keyboard.nextInt();
                           keyboard.nextLine();
                           // Determine which command was selected.
                           switch (choice) {
                           case 1: // 1. Add a Librarian to the system.
                           adm.AddLib(nwlib);
                           break;
                           case 2: // 2. Delete a Librarian from the system.
                           adm.DelLib(rmlib);
                           break;
                           case 3: // 3. logout the system.
                           adm.logout();
                           break;
                           default: // Invalid command
                           System.out.println("That is not a valid command.");
                           }
                            System.out.print("Would you like to exit, Y or N: ");
                            exit = keyboard.nextLine().charAt(0);
                           }
                           }else{
                             System.out.println("Welcome "+usr.getUsername()+", is a member"); 
                             char exit = 'N';
                             while (exit != 'Y') {
                             System.out.println("Welcome "+usr.getUsername()+", what would you like to do today ?");
                             System.out.println("\t1. Request a book.");
                             System.out.println("\t2. Return a book.");
                             System.out.println("\t3. Logout.");
                             System.out.print("Enter the number that applies: ");
                             int choice = keyboard.nextInt();
                             keyboard.nextLine();
                             switch (choice) {
                             case 1: // 1. Request a book.
                             Book2.requestBook(usr, Book2.getTitle(), LocalDate.of(2019, 06, 16));
                             break;
                             case 2: // 2. Return a book.
                             Book2.returnBook(Book2.getTitle());
                             break;
                             case 3: // 3. logout the system.
                             usr.logout();
                             break;
                             default: // Invalid command
                             System.out.println("That is not a valid command.");
                             }
                             System.out.print("Would you like to exit, Y or N: ");
                             exit = keyboard.nextLine().charAt(0);
                             }
                             }
        }

   }
}
