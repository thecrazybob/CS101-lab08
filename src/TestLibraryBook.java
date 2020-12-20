/**
 * Lab08
 * Instructions for Lab08a are in README.md file located in the root directory of Lab08a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab08
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab08/
 *
 * @author Mohammed Sohail
 * @version 20/12/2020
 */

public class TestLibraryBook {

    public static void main(String[] args) {

        /*
        *   CASE (a)
        */

        System.out.println("Now evaluating case (a):");

        // create a unique object and a second variable which represents the first object
        LibraryBook library_book_1 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "20.12.2020");
        LibraryBook library_book_2 = library_book_1;

        // print out string representations of the above two objects
        System.out.println(library_book_1.toString());
        System.out.println(library_book_2.toString());

        // print out result of == and .equals comparison
        System.out.println("library_book_1 == library_book_2: " + (library_book_1 == library_book_2));
        System.out.println("library_book_1.equals(library_book_2): " + (library_book_1.equals(library_book_2)));

        System.out.println("-------");

        /*
        *   CASE (b)
        */

        System.out.println("Now evaluating case (b):");

        // create two unique objects (with different properties)
        LibraryBook library_book_3 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "20.12.2020");
        LibraryBook library_book_4 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "30.12.2020");

        // print out string representations of the above two objects
        System.out.println(library_book_3.toString());
        System.out.println(library_book_4.toString());

        // print out result of == and .equals comparison
        System.out.println("library_book_3 == library_book_4: " + (library_book_3 == library_book_4));
        System.out.println("library_book_3.equals(library_book_4): " + (library_book_3.equals(library_book_4)));

        System.out.println("-------");

        /*
        *   CASE (c)
        */

        System.out.println("Now evaluating case (c):");

        // create two identical objects
        LibraryBook library_book_5 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "20.12.2020");
        LibraryBook library_book_6 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "20.12.2020");

        // print out string representations of the above two objects
        System.out.println(library_book_5.toString());
        System.out.println(library_book_6.toString());

        // print out result of == and .equals comparison
        System.out.println("library_book_5 == library_book_6: " + (library_book_5 == library_book_6));
        System.out.println("library_book_5.equals(library_book_6): " + (library_book_5.equals(library_book_6)));
        
        System.out.println("-------");
        
        /*
        *   Copy constructor
        */
        
        LibraryBook library_book_7 = new LibraryBook("The art of living : the classic manual on virtue, happiness, and effectiveness", "Epictetus.", "20.12.2020");
        LibraryBook library_book_8 = new LibraryBook(library_book_7);
        
        // print out result of == and .equals comparison
        System.out.println("library_book_7 == library_book_8: " + (library_book_7 == library_book_8));
        System.out.println("library_book_7.equals(library_book_8): " + (library_book_7.equals(library_book_8)));
        
        System.out.println("-------");

        /*
        *   hasSameTitle()
        */
        
        // compare if two books have the same title
        System.out.println("Does library_book_7 and library_book_8 have the same title?: " + (library_book_7.hasSameTitle(library_book_8)));
        System.out.println("-------");
        
        /*
        *   hasSameAuthor()
        */
        
        // compare if two books have the same author
        System.out.println("Does library_book_7 and library_book_8 have the same author?: " + (library_book_7.hasSameAuthor(library_book_8)));
        System.out.println("-------");
    
    }
    
}
