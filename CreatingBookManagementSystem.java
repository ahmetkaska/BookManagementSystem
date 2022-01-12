
import java.util.ArrayList;
import java.util.Scanner;

public class CreatingBookManagementSystem extends BookManagementSystem {

    private int position;

    private ArrayList<String> book_list = new ArrayList<String>();
    Scanner input = new Scanner(System.in);

    public CreatingBookManagementSystem(String book_name, String book_author, String book_category,
            String book_subject, String book_id, String book_publication_date, int position) {
        super(book_name, book_author, book_category, book_subject, book_id, book_publication_date);

        this.position = position;
    }

    public void make_book_list() {
        System.out.println("List of book has " + book_list.size() + " books.");
        for (int i = 0; i < book_list.size(); i++) {
            System.out.println((i + 1) + ". Book : " + book_list.get(i));
        }
    }

    public void addingBook(String book_name ) {
        book_list.add(book_name);
        
         showInfosCreatBook();
        System.out.println("Book List is updating...");

    }

    public void deletingBook(int position) {
        String book_name = book_list.get(position);
        book_list.remove(position);
        System.out.println(book_name + " book is deleting from book list...");

    }

    public void updatingBook(String book_name, int position) {
        book_list.set(position, book_name);
        System.out.println("Book List is updating...");

    }

    public void searchingBook(String book_name) {
        int position = book_list.indexOf(book_name);
        if (position >= 0) {
            System.out.println("Book founded...");
            System.out.println(book_name + " book is  " + (position + 1) + " position ");
        } else {
            System.out.println("Book has not found...");
        }

    }

    @Override
    void application_processes() {
        String application_processes = "\t 0- Show Operations\n"
                + "\t 1-Show the Books\n"
                + "\t 2-Adding Book\n"
                + "\t 3-Updating Book\n"
                + "\t 4-Deleting Book\n"
                + "\t 5-Searching Book\n"
                + "\t 6- Exit Aplication";
        System.out.println(application_processes);

    }

    @Override
    void showBooks() {
        make_book_list();
    }

    @Override
    void addBooks() {
        System.out.print("Please ,which book do you want ? ");
        String book_name = input.nextLine();
        
        showInfosCreatBook();
        System.out.println("-------------------------------------");
        addingBook(book_name );
    }

    @Override
    void updateBooks() {
        System.out.print(" Which position desired to be updated (1,2,3....) : ");
        int position = input.nextInt();
        input.nextLine();
        System.out.print("Please, enter the new name of book : ");
        String new_book_name = input.nextLine();
        updatingBook(new_book_name, position-1);
     
    }

    @Override
    void deleteBooks() {
        System.out.print("Which position do you want to delete (1,2,3...): ");
        int position = input.nextInt();
        input.nextLine();
        deletingBook(position-1);
    }

    @Override
    void searchBooks() {
        System.out.print("Which book do you want to search : ");
        String book_name = input.nextLine();
        searchingBook(book_name);
    }
   

}
