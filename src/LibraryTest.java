import java.util.Scanner;

/**
 * Lab08
 * Instructions for Lab08b are in README.md file located in the root directory of Lab08b
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab08
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab08/
 *
 * @author Mohammed Sohail
 * @version 20/12/2020
 */

public class LibraryTest {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        // variables
        Library library = new Library();
        LibraryBook bookFound;
        String action;
        String title;
        String author;
        String newDueDate;
        
        // welcome the user
        System.out.println("------");
        System.out.println("Welcome to the digital library!");

        // loop through user's actions/responses
        while (true) {

            // possible actions
            System.out.println("------");
            System.out.println("Select your action:");
            System.out.println("- Show");
            System.out.println("- Find");
            System.out.println("- Add");
            System.out.println("- Exit");
            System.out.println("------");

            action = scan.next();

            // monitor if user has opted to exit
            if (action.equalsIgnoreCase("Exit")) {

                System.out.print("See you soon!");
                break;
            
            }

            // monitor if user has opted to see the library catalog
            if (action.equalsIgnoreCase("Show")) {

                System.out.println(library.toString());
            
            }

            // monitor if user has opted to add a book
            if (action.equalsIgnoreCase("Add"))  {

                // prompt for book title
                System.out.println("Please enter the book's title: ");
                title = scan.next();

                // prompt for book author
                System.out.println("Please enter the book's author: ");
                author = scan.next();

                // add the book to library
                library.add(title, author);
            
            }

            // monitor if user has opted to find to a book
            if (action.equalsIgnoreCase("Find"))  {

                title = scan.next();
                bookFound = library.findByTitle(title);

                if (library.isEmpty()) {

                    System.out.println("The library is empty");

                }

                else if (bookFound == null) {

                    System.out.println("No such book found :(");

                }

                else {

                    while (bookFound != null) {

                        System.out.println("------");
                        System.out.println("Select your action: ");
                        System.out.println("Loan");
                        System.out.println("Return");
                        System.out.println("Remove");
                        System.out.println("Exit");
                        System.out.println("------");

                        action = scan.next();

                        // monitor if user has opted to exit
                        if (action.equalsIgnoreCase("Exit") ) {

                            System.out.print("Goodbye!");
                            break;

                        }

                        // monitor if user has opted to loan the book
                        if (action.equalsIgnoreCase("Loan") ) {           

                            System.out.println("Enter new due date: ");
                            newDueDate = scan.nextLine();
                            library.library.get(library.getIndex(bookFound)).loanBook(newDueDate);

                        }

                        // monitor if user has opted to return the book
                        if (action.equalsIgnoreCase("Return") ) {           

                            library.library.get(library.getIndex(bookFound)).returnBook();
                            System.out.println("Book has been returned!");

                        }

                        // monitor if user has opted to remove the book from library
                        if (action.equalsIgnoreCase("Remove") ) {           

                            library.library.remove(library.getIndex(bookFound));
                            System.out.println("Book has been removed!");

                        }

                    }

                }

            }

        }

        scan.close();

    }

}
