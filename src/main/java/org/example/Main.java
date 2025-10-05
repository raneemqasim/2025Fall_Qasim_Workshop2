package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //You'll need an array of 20 books, put it here
        Book[] books = new Book[20];

        // Initialize books with sci-fi and fantasy titles
        books[0] = new Book(0, "978-0-441-01394-5", "Dune", false, null);
        books[1] = new Book(1, "978-0-345-39180-3", "The Hitchhiker's Guide to the Galaxy", false, null);
        books[2] = new Book(2, "978-0-553-38034-0", "Foundation", false, null);
        books[3] = new Book(3, "978-0-345-33968-0", "The Lord of the Rings", false, null);
        books[4] = new Book(4, "978-0-765-31178-0", "Mistborn: The Final Empire", false, null);
        books[5] = new Book(5, "978-0-441-17271-9", "Neuromancer", false, null);
        books[6] = new Book(6, "978-0-345-39181-0", "Ender's Game", false, null);
        books[7] = new Book(7, "978-0-553-57340-5", "A Game of Thrones", false, null);
        books[8] = new Book(8, "978-0-765-36792-2", "The Way of Kings", false, null);
        books[9] = new Book(9, "978-0-441-56959-4", "The Left Hand of Darkness", false, null);
        books[10] = new Book(10, "978-0-553-57341-2", "A Clash of Kings", false, null);
        books[11] = new Book(11, "978-0-765-36563-8", "Words of Radiance", false, null);
        books[12] = new Book(12, "978-0-553-29335-0", "The Name of the Wind", false, null);
        books[13] = new Book(13, "978-0-316-01984-0", "The Fifth Season", false, null);
        books[14] = new Book(14, "978-0-441-00549-0", "Starship Troopers", false, null);
        books[15] = new Book(15, "978-0-345-34897-2", "Childhood's End", false, null);
        books[16] = new Book(16, "978-0-765-31179-7", "The Well of Ascension", false, null);
        books[17] = new Book(17, "978-0-553-80370-4", "A Storm of Swords", false, null);
        books[18] = new Book(18, "978-0-316-12908-4", "Red Rising", false, null);
        books[19] = new Book(19, "978-0-765-32044-7", "The Hobbit", false, null);

        //You'll need a scanner to take in user input. Make one.
        Scanner scanner = new Scanner(System.in);

        //You'll need a menu. A while(true) loop will be helpful
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the book library!");
            System.out.println("Please choose from the following options:");
            System.out.println("1) Show available books");
            System.out.println("2) Show checked out books");
            System.out.println("3) Exit");
            int userInput1 = scanner.nextInt();

            //Based on what they type, make a switch case to handle it
            //Be sure they can exit the program!
            switch (userInput1) {
                case 1:
                    //show available books:
                    //Use a for loop and sout to print all the book titles
                    //remember to use your Book class getters
                    //Use if statements to filter out books that are checkedin/out as need be

                    for (int i = 0; i < books.length; i++) {
                        if (books[i].isCheckedOut() == false) {
                            System.out.printf("%n" + books[i].toString() + "%n");
                        }
                    }

                    System.out.println("1) Check out book");
                    System.out.println("2) Back");

                    int userInput2 = scanner.nextInt();

                    switch (userInput2) {
                        case 1:
                            System.out.println("Please enter the id of the book you want to check out.");
                            int bookToCheckOut = scanner.nextInt();
                            scanner.nextLine();
                            books[bookToCheckOut].setCheckedOut(true);
                            System.out.println("What is your name?");
                            String userName = scanner.nextLine();
                            books[bookToCheckOut].setCheckedOutTo(userName);
                            System.out.println("Success!");
                            break;
                        case 2:
                            break;

                    }

                    break;

                case 2:
                    //show checked out books
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].isCheckedOut() == true) {
                            System.out.printf("%n" + books[i].toString() + "%n");
                        }
                    }

                    System.out.println("1) Check in a book");
                    System.out.println("2) Back");

                    int userInput3 = scanner.nextInt();

                    switch (userInput3) {
                        case 1:
                            System.out.println("Please enter the id of the book you want to check in.");
                            int bookToCheckIn = scanner.nextInt();
                            books[bookToCheckIn].setCheckedOut(false);
                            books[bookToCheckIn].setCheckedOutTo(null);
                            System.out.println("Success!");
                            break;
                        case 2:
                            break;
                    }

                    break;

                case 3:
                    running = false;

                    //You will call the checkIn() and checkOut() methods
                    //If the user wants to check in or out
                    //Remember if they check out you must ask for their name!
                    //example: book.checkOut(name) or book.checkIn()


            }
        }
    }
}