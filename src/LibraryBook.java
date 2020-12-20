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

public class LibraryBook {

    // properties
    String title, author, dueDate;
    int timesLoaned;

    /** 
     * Constructor for LibraryBook with initialization of the LibraryBook object's data
     */
    public LibraryBook(String bookName, String bookAuthor, String bookDueDate) {

        title = bookName;
        author = bookAuthor;
        dueDate = bookDueDate;
        timesLoaned = 0;
    
    }

    /** 
     * Copy Constructor
     */
    public LibraryBook(LibraryBook objectToBeCopied) {

        title = objectToBeCopied.title;
        author = objectToBeCopied.author;
        dueDate = objectToBeCopied.dueDate;
        timesLoaned = objectToBeCopied.timesLoaned;
    
    }

    /** 
     * Loans a book (increments timesLoaned and changes dueDate)
     * @return void
     */
    public void loanBook(String date) {

        timesLoaned += 1;
        dueDate = date;

    }

    /** 
     * Returns a book (dueDate is reset)
     * @return void
     */
    public void returnBook() {

        dueDate = "";
    
    }

    /** 
     * Returns the number of times the book has been loaned
     * @return int
     */
    public int getTimesLoaned() {

        return timesLoaned;
    
    }

    
    /** 
     * Returns if the book is currently being loaned
     * @return boolean
     */
    public boolean onLoan() {

        return (dueDate == "") ? false : true;
    
    }

    
    /** 
     * Returns the string representation of the object
     * @return String
     */
     public String toString() {

        return "title: " + title + " author: " + author + " dueDate: " + dueDate + " timesLoaned: " + timesLoaned;
    
    }

    
    /** 
     * Evaluates if the title and author of the current instance of LibraryBook matches the input object
     * @param comparisonObject
     * @return boolean
     */
    public boolean equals(LibraryBook comparisonObject) {
        if (title == comparisonObject.title && author == comparisonObject.author) {
            return true;
        }
        else {
            return false;
        }
    }

    
    /** 
     * Evaluates if the current and the comparisonObject has the same title
     * @param comparisonObject
     * @return boolean
     */
    public boolean hasSameTitle(LibraryBook comparisonObject) {
        
        if (this.title == comparisonObject.title) {
            return true;
        }
        else {
            return false;
        }

    }

    
    /** 
     * Evaluates if the current and the comparisonObject has the same author
     * @param comparisonObject
     * @return boolean
     */
    public boolean hasSameAuthor(LibraryBook comparisonObject) {
        
        if (this.author == comparisonObject.author) {
            return true;
        }
        else {
            return false;
        }

    }

}
