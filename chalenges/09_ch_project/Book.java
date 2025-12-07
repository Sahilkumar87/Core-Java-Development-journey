public class Book{
    static int totalBooks;
    String title;
    String author;
    String isBn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }

    { // object Init;
        totalBooks++;
    }
    Book(String isBn, String title, String author){
        this.isBn = isBn;
        this.title = title;
        this.author = author;
    }

    Book(String isBn){
        this(isBn, "unknown", "unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }


    void borrowedBook(){
        if(isBorrowed){
            System.out.println("book is already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("enjoy " + this.title);
        }
    }


    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("hope you enjoyed, Please leave a review ");
        }
        else{
            System.out.println("This book is already in the library");
        }
    }



    public static void main(String[] args) {

        Book designOfThings = new Book("1", "design", "author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowedBook();
        myBook.borrowedBook();
        designOfThings.borrowedBook();
        designOfThings.returnBook();
        designOfThings.returnBook();



        
    }

    
}