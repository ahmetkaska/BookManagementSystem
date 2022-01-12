
import java.util.Scanner;


public abstract class BookManagementSystem {

    private String book_name;
    private String book_author;
    private String book_category;
    private String book_subject;
    private String book_id;
    private String book_publication_date;
    
    Scanner input =new Scanner(System.in);
    
    public BookManagementSystem(String book_name, String book_author,
            String book_category, String book_subject, String book_id, String book_publication_date) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_category = book_category;
        this.book_subject = book_subject;
        this.book_id = book_id;
        this.book_publication_date = book_publication_date;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_category() {
        return book_category;
    }

    public void setBook_category(String book_category) {
        this.book_category = book_category;
    }

    public String getBook_subject() {
        return book_subject;
    }

    public void setBook_subject(String book_subject) {
        this.book_subject = book_subject;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_publication_date() {
        return book_publication_date;
    }

    public void setBook_publication_date(String book_publication_date) {
        this.book_publication_date = book_publication_date;
    }

    abstract void application_processes();

    abstract void showBooks();

    abstract void addBooks();

    abstract void updateBooks();

    abstract void deleteBooks();

    abstract void searchBooks();
    
      public void showInfosCreatBook() {
        System.out.print("Please, enter the author name of book : ");
        String book_author = input.nextLine();
        System.out.println(book_author);
        System.out.print("Please, enter the category of book : ");
        String book_category = input.nextLine();
        System.out.println(book_category);
        System.out.print("Please, enter the subject of book : ");
        String book_subject = input.nextLine();
        System.out.println(book_subject);
        System.out.print("Please, enter the id number of book : ");
        String book_id = input.nextLine();
        System.out.println(book_id);
        System.out.print("Please, enter the publication date of book : ");
        String book_publication_date = input.nextLine();
        System.out.println(book_publication_date);
      
     

        

    }

}
