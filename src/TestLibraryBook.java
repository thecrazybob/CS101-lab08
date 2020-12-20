/**
 * Lab07
 * Instructions for Lab07b are in README.md file located in the root directory of Lab07b
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab07
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab07/
 *
 * @author Mohammed Sohail
 * @version 12/12/2020
 */

public class TestLibraryBook {

    public static void main(String[] args) {

        // create 3 objects of LibraryBook
        LibraryBook library_book_1 = new LibraryBook();
        LibraryBook library_book_2 = new LibraryBook();
        LibraryBook library_book_3 = new LibraryBook();

        // print out string representations of the 3 LibraryBook objects
        System.out.println(library_book_1.toString());
        System.out.println(library_book_2.toString());
        System.out.println(library_book_3.toString());

        // return the book
        library_book_1.returnBook();

        // print out if the book is on loan
        System.out.println(library_book_1.onLoan());

        // loan book 2 three times
        library_book_2.loanBook();
        library_book_2.loanBook();
        library_book_2.loanBook();

        // print count of times loaned
        System.out.println(library_book_2.getTimesLoaned());
        
    }
}
