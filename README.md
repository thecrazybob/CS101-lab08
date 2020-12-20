**(a) Library Books again**

First, copy your LibraryBook and TestLibraryBook files from *lab07b*, into a new *lab08* project folder.

Next, without changing the LibraryBook class, add code to the main method so as to compare two LibraryBook instances using == and .equals. Make sure your test data includes all three possible alternatives, that is (a) two references to a single object, (b) two references to two individual objects with different properties, (c) two references to two individual objects with identical relevant properties. Notice that your program compiles(!) and runs, and that both comparisons give the same results in all cases. Can you explain why?

Next add a .equals method to your LibraryBook class, so that books with the same title and author are considered the same (irrespective of their dueDate or timesLoaned). Run the program again, demonstrate & explain any changes in output from the previous run.

Finally, add a copy constructor and two other methods, hasSameTitle and hasSameAuthor, to your LibraryBook class. Both methods should take a LibraryBook as a parameter and return a boolean value. Check they are all working correctly before moving on.

**(b) Build a Library... (*a collection of LibraryBooks!)*\
**

Note: you can do this in the same project/workspace as part (a).

Create a new class called Library, that uses an instance of Java's ArrayList class to manage a collection of LibraryBooks. Its constructor should create an empty library. Include the following instance methods:

-   isEmpty() ~ returns true iff there are no books in the library
-   toString() ~ returns a String representation of the library, one book per line (or a message if library is empty)
-   add( title, author) ~ adds a new book --with the given title and author-- to the library
-   remove( book) ~ removes the specified book from the library. Returns false if the book is not in library
-   findByTitle( title) ~ returns the first book with the given title or null if no such book is found.

Write a program, LibraryTest, that allows the user to manage a library by selecting options from a menu that includes: Show, Find, Add, and Exit. If the Find option locates a book with the requested title it should show it to the user and then allow them to Loan it, Return it, or Remove it from the library, or simply exit back to the main menu.