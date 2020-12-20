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
    public LibraryBook() {

        title = "The art of living : the classic manual on virtue, happiness, and effectiveness";
        author = "Epictetus.";
        dueDate = "12.12.2020";
        timesLoaned = 0;
    
    }

    /** 
     * Loans a book (increments timesLoaned and changes dueDate)
     * @return void
     */
    public void loanBook() {

        timesLoaned += 1;
        dueDate = "22.12.2020";

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
}
