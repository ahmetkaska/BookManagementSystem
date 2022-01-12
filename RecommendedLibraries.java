
public class RecommendedLibraries {

    private String library_address;
    private String libray_web_address;
    private String library_tell;
    private Book book;

    public RecommendedLibraries(Book book, String library_address,
            String libray_web_address, String library_tell) {
        this.book = book;

        this.library_address = library_address;
        this.libray_web_address = libray_web_address;
        this.library_tell = library_tell;

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLibrary_address() {
        return library_address;
    }

    public void setLibrary_address(String library_address) {
        this.library_address = library_address;
    }

    public String getLibray_web_address() {
        return libray_web_address;
    }

    public void setLibray_web_address(String libray_web_address) {
        this.libray_web_address = libray_web_address;
    }

    public String getLibrary_tell() {
        return library_tell;
    }

    public void setLibrary_tell(String library_tell) {
        this.library_tell = library_tell;
    }

    public void bogaziciLibrary() {
        System.out.println("Welcome to Bogazici Library ....");
        System.out.println(" ");
        System.out.println("Informations of Library ; ");
        System.out.println(" ");
        System.out.println("Library Address : " + getLibrary_address());
        System.out.println(("Library Website Adrress " + getLibray_web_address()));
        System.out.println("Library Tell Number : " + getLibrary_tell());
        System.out.println("*************************************************");
        Book book1 = new Book("Kurk Mantolu Madonna", "Sebahattin Ali", "Novel", "Relationship", 1, "1943");
        Book book2 = new Book("Yalnız Efe", "Omer Seyfettin", "Novel", "Resistance of a woman", 2, "25 Nisan 1918 ");
        Book book3 = new Book("Kucuk Prens", "Antoine de Saint-Exupéry", "Tale", "Adventure", 3, "1943");
        book1.showInfosBook();
        System.out.println("*******************************************");
        book2.showInfosBook();
        System.out.println("*******************************************");
        book3.showInfosBook();
        System.out.println("*******************************************");

    }

    public void fsmLibrary() {
        System.out.println("Welcome to Fsm Library ....");
        System.out.println(" ");
        System.out.println("Informations of Library ; ");
        System.out.println(" ");
        System.out.println("Library Address : " + getLibrary_address());
        System.out.println("Library Website Adrress " + getLibrary_address());
        System.out.println("Library Tell Number : " + getLibrary_tell());
        System.out.println("*************************************************");
        Book book4 = new Book("Simyacı", "Paulo Coelho", "Novel", "The philosophical life story of the treasure hunter", 4, "1996");
        Book book5 = new Book("Kumarbaz", "Fyodor Dostoyevski", "Novel", "Gambling", 5, "1867");
        Book book6 = new Book("Seker Portakalı", "José Mauro De Vasconcelos", "Novel", "Imagation", 6, "2009");
        book4.showInfosBook();
        System.out.println("*******************************************");
        book5.showInfosBook();;
        System.out.println("*******************************************");
        book6.showInfosBook();
        System.out.println("*******************************************");
    }

    public void ataturkLibrary() {
        System.out.println("Welcome to Ataturk Library ....");
        System.out.println(" ");
        System.out.println("Informations of Library ; ");

        System.out.println(" ");
        System.out.println("Library Address : " + getLibrary_address());
        System.out.println("Library Website Adrress " + getLibrary_address());
        System.out.println("Library Tell Number : " + getLibrary_tell());
        System.out.println("***************************************************");
        Book book7 = new Book("Iki Sehrin Hikayesi", "Charles Dickens", "Novel", "Effects of the French Revolution", 0007, "1859");
        Book book8 = new Book("Pürdikkat", "Cal Newport", "Indivudial Improvement", "Ability to focus", 8, "5 Ocak 2016");
        Book book9 = new Book("Safahat", "Mehmet Âkif Ersoy", "Poem", "History and religion", 9, "1911");
        book7.showInfosBook();
        System.out.println("*******************************************");
        book8.showInfosBook();
        System.out.println("*******************************************");
        book9.showInfosBook();
        System.out.println("*******************************************");

    }

}
