//@Version June 1st. 2019
//@Author Rodrigue.

import User.*;
import member.*;
import adresse.*;
import librarian.*;
import Book.*;
import BookHandler.*;
import java.util.Scanner;

public class Rodrigue { 

public static void main(String args[]){

        Address ad = new Address(12, "Douala", "Kmer");
        Librarian usr = new Librarian("Rodrigue", "One", "Librarian", 111, ad);
        Book Book1 = new Book("L'Urgence de la pensee", "Maurice Kamto", "124EBN125");
        Book Book2 = new Book("Starting Out with Java", "Tony Gaddis", "0133957055");
        //BookHandler bh = new BookHandler();
        //User usr = new User("Rodrigue", "One", "Librarian");
        //boolean flag = lib1.login();
        boolean flag = usr.login();
        
        Scanner keyboard = new Scanner(System.in); 

        if(!flag){
                System.out.println("login or password is incorrect");
                }else{
                    if(usr.getRole()=="Librarian"){
                     System.out.println("I'm Librarian");
                     char exit = 'N';
                     while (exit != 'Y') {
                     System.out.println("Welcome "+usr.getUsername()+", what would you like to do today ?");
                     System.out.println("\t1. Add a book to the system.");
                     System.out.println("\t2. Search a book from the system.");
                     System.out.println("\t3. Issue a book to a member.");
                     System.out.println("\t4. Remove a book from the system.");
                     System.out.println("\t5. Logout.");
                     System.out.print("Enter your choice : ");
                     int choice = keyboard.nextInt();
                     keyboard.nextLine();
                     switch (choice) {
                     case 1: 
                     Book1.addNewBook(Book1);
                     Book2.addNewBook(Book2);
                     break;
                     case 2: 
                     Book2.searchBook(Book2.getTitle());
                     break;
                     case 3: 
                     //Book1.IssueBook(Book1);
                     case 4: 
                     Book1.delBook(Book1);
                     break;
                     case 5: 
                     usr.logout();
                     break;
                     default: 
                     System.out.println("That is not a valid choice.");
                     }
                     System.out.print("Would you like to exit, Y or N: ");
                     exit = keyboard.nextLine().charAt(0);
                     }
                     }else if(usr.getRole()=="Admin"){
                           System.out.println("I'm Admin");
                           char exit = 'N';
                           while (exit != 'Y') {
                           System.out.println("Welcome "+usr.getUsername()+", what would you like to do today ?");
                           System.out.println("\t1. Add a Librarian.");
                           System.out.println("\t2. Delete a Librarian.");
                           System.out.println("\t3. Logout.");
                           System.out.print("Enter your choice : ");
                           int choice = keyboard.nextInt();
                           keyboard.nextLine();
                           switch (choice) {
                           case 1: 
                           //addLib();
                           break;
                           case 2: 
                           //deleteLib();
                           break;
                           case 3: 
                           //logout();
                           break;
                           default: 
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
                             System.out.print("Enter your choice: ");
                             int choice = keyboard.nextInt();
                             keyboard.nextLine();                            
                             switch (choice) {
                             case 1: 
                             //Book2.requestBook(Book);
                             break;
                             case 2: 
                             //Book2.returnBook(Book);
                             break;
                             case 3: 
                             //logout();
                             break;
                             default: 
                             System.out.println("That is not a valid command.");
                             }
                             System.out.print("Would you like to exit, Y or N: ");
                             exit = keyboard.nextLine().charAt(0);
                             }
                             }}

   }
}
