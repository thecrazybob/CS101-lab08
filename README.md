**(a) Library Books again**

First, copy your LibraryBook and TestLibraryBook files from *lab07b*, into a new *lab08* project folder.

Next, without changing the LibraryBook class, add code to the main method so as to compare two LibraryBook instances using == and .equals. Make sure your test data includes all three possible alternatives, that is (a) two references to a single object, (b) two references to two individual objects with different properties, (c) two references to two individual objects with identical relevant properties. Notice that your program compiles(!) and runs, and that both comparisons give the same results in all cases. Can you explain why?

Next add a .equals method to your LibraryBook class, so that books with the same title and author are considered the same (irrespective of their dueDate or timesLoaned). Run the program again, demonstrate & explain any changes in output from the previous run.

Finally, add a copy constructor and two other methods, hasSameTitle and hasSameAuthor, to your LibraryBook class. Both methods should take a LibraryBook as a parameter and return a boolean value. Check they are all working correctly before moving on.