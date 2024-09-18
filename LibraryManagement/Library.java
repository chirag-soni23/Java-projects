package LibraryManagement;
import java.util.ArrayList;

class Library{
    private final ArrayList<Book> books = new ArrayList<>();

    // add book
    public void addBook(Book book){
        books.add(book);
        System.out.println("The book " + book.getTitle() + " is added library");
    }
    
    // issue book
    public void issueBook(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.isIsIssued();
                return ;
            }
        }
        System.out.println("The book " + title + " is not available in the library");
    }

    // return book
    public void returnBook(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.returnBook();
                return ;
            }
        }
        System.out.println("The book " + title + " is not available in the library");
    }

    // display books
    public void displayBook(){
        if(books.isEmpty()){
            System.out.println("No books available in the library");
        }else{
            for(Book book: books){
                book.displayInfo();
            }
        }
    }


}