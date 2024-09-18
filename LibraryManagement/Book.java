package LibraryManagement;

class Book{
    private final String title;
    private final String author;
    private  boolean isIssued;

    public Book(String title,String author, boolean isIssued){
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIsIssued() {
        return isIssued;
    }
    
    // issued book
    public void issuedBook(){
        if(!isIssued){
            isIssued = true;
            System.out.println("The book " + title + " is issued");
        }else{
            System.out.println("The book is already issued.");
        }
    }

    // return book
    public void returnBook(){
        if(isIssued){
            isIssued = false;
            System.out.println("The book " + title + " is returned");
        }else{
            System.out.println("The book was not issued.");
        }
    }

    // display information
    public void displayInfo(){
        System.out.println("Title: " + title + " Author: " + author + " Issued: " + isIssued);
    }



    
}