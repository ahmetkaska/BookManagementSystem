
public class Book {

    private String name;
    private String author;
    private String category;
    private String subject;
    private int id;
    private String publication_date;
    
    public Book(String name, String author, String category, String subject, int id, String publication_date) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.subject = subject;
        this.id = id;
        this.publication_date = publication_date;

    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public void showInfosBook() {

        System.out.println("Books informations");
        System.out.println("Book Name : " + getName());
        System.out.println("Book Author : " + getAuthor());
        System.out.println("Book Category : " + getCategory());
        System.out.println("Book Subject : " + getSubject());
        System.out.println("Book Id Number : " + getId());
        System.out.println("Publication Date of the Book : " + getPublication_date());

    }

}
