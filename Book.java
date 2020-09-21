/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 *Exercise 2.86
 *The object is immutable because I do not have methods that touch the fields
 *inside of the books.
 *
 * @author Erick Rubio
 * @version Sept 21, 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    // Exercise 2.85
    private int pages;
    // Exercise 2.88
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     * Exercise 2.85 add pages to constructor
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author      = bookAuthor;
        title       = bookTitle;
        pages       = bookPages;
        refNumber   = "";
    }

    // Add the methods here ...
    /**
     * Provide access to the string holding the author's name
     * @return author
     * Problem 2-83 return author
     */
    public String getAuthor()
    {
        return author;
    }
    
        /**
     * Provide access to the string holding the book's title
     * @return title
     * Problem 2-83 return author
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Exercise 2.85 getPages
       */
    public int getPages(){
        return pages;
    }
    
    /**
     * Exercise 2.84 print author in terminal
       */
    public void printAuthor(){
        System.out.println("Author is: " + author);
    }

    /**
     * Exercise 2.84 print title in terminal
       */
    public void printTitle(){
        System.out.println("Title of the book is: " + title);
    }
    
    /**
     * Exercise 2.87 print book details
     * Exercise 2.89 print book refNumber
       */
    public void printDetails(){
        System.out.println("\nBook Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Page Count: " + pages);
        if(refNumber != ""){
            System.out.println("Book Reference Number: " + refNumber);
        }else{
            System.out.println("Book Reference Number: " + "ZZZ");
        }

    }
    /**
     * Exercise 2.88 Set book reference number
     * Exercise 2.90 Make sure reference is greater than 3 characters
    */
   public void setRefNumber(String ref){
       if(ref.length() >= 3){
           refNumber = ref;
        }else{
            System.out.println("Please enter a number greater than 3");
            refNumber = "";
        }
    }
    
   public String getRefNumber(){
       return refNumber;
   }
}
