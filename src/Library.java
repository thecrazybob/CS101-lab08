import java.util.ArrayList;

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

public class Library {

    // variables
    ArrayList<LibraryBook> library;
    String books;
    LibraryBook newBook;
    boolean bookFound;
    
    /** 
     * Constructor for Library with initialization of the Library object's data
     */
    public Library() {
        library = new ArrayList<LibraryBook>();
    }

    
    /** 
     * Returns true if there are no books in the library
     * @return boolean
     */    
    public boolean isEmpty() {

        if (library.size() == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    /** 
     * Returns a String representation of the library, one book per line (or a message if library is empty)
     * @return String
     */
    public String toString() {
        
        if (isEmpty()) {
        
            return "The library doesn't contain any books";
        
        }

        else {

            books = "";
            
            for (LibraryBook book : library) {
                books = books + "\n" + book.toString();
            }

            return books;

        }

    }

    /** 
     * Adds a new book with the given title and author to the library 
     * @param title
     * @param author
     * @return boolean
     */
    public boolean add(String title, String author) {

        newBook = new LibraryBook(title, author, "");

        library.add(newBook);

        return true;

    }
    
    /**
     * Removes the specified book from the library. Returns false if the book is not in library
     * @param book
     * @return boolean
     */
    public boolean remove(LibraryBook book) {

        if (library.contains(book)) {

            library.remove(book);
            return true;

        }
        
        else {

            return false;

        }

    }
    
    /** 
     * Returns the first book with the given title or null if no such book is found.
     * @param title
     * @return LibraryBook
     */    
    public LibraryBook findByTitle(String title) {

        newBook = new LibraryBook(title, "test", "test");
        
        for (int i = 0; i < library.size(); i++) {

            if (library.get(i).hasSameTitle(newBook)) {

                newBook = library.get(i);
                bookFound = true;
                break;
                
            }

        }
        
        if (bookFound == false ) {

            newBook = null;
            return newBook;
        
        }

        else {

            return newBook;
        
        }
        
    }

    /** 
     * Returns index of object in library ArrayList
     * @param bookObject
     * @return int
     */
    public int getIndex(LibraryBook bookObject) {

        int index = 0;

        for (LibraryBook book : library) {
            
            if (book == bookObject) {
                return index;
            }
            else {
                index++;
            }
        }

        return index;

    }

}
