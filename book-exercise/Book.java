/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Ronen Nii Ayi Hammond 10899320.)
 * @version (16th March 2022.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";
    private boolean onLoan;
    private int loanCount;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPage)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPage;
        onLoan = false;
        loanCount = 0;
    }

    // Add the methods here ...
    
    // Return name of author
    public String getAuthor()
    {
        return author;
    }
    
    // Return name of title
    public String getTitle()
    {
        return title;
    }
    
    // Return number of pages in book
    public int getPages()
    {
        return pages;
    }
    
    // prints all information about the book to the terminal window
    public void printDetails()
    {
        System.out.println("Author of book: " + author);
        System.out.println("Title of book: " + title);
        System.out.println("Number of pages: " + pages);
        
        if (refNumber != "")
        {
            System.out.println("Reference Number: " + refNumber);
        }
        else
        {
            System.out.println("zzz");
        }
        
        if(onLoan == true)
        {
            System.out.println("This book is on loan");
            System.out.println("It has been borrowed " + loanCount + " times.");
        }
        else
        {
            System.out.println("This book is not on loan");
            System.out.println("It has been borrowed " + loanCount + " times.");
        }
        
    }
    
    // Adds a Reference Number to the book.
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) // makes sure the length of the reference Number isn't less than 3
        {
            refNumber = ref;

        }
        else
        {
            System.out.println("Sorry but your reference number can not be less than three characters");
        }
    }
    
    // Returns reference number
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // Method for borrowing a book
    public void borrow()
    {
        if(onLoan == false)
        {
            onLoan = true;
            loanCount ++;
        }
        else
        {
            System.out.println("This book is not available");
        }
    }
    
    // Method for returning a borrowed book
    public void returnBook()
    {
        if(onLoan == true)
        {
            onLoan = false;
        }else
        {
            System.out.println("Sorry but the book you returned isn't on loan.");
        }
    }
}
