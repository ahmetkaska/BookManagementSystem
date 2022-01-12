
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Friendly Book Management System...");
        String processes = "\t 1-Reccommended Libraries\n"
                + "\t 2-Creating Book Management System\n"
                + "\t q-Exit Book Management System...";
        System.out.println("  ");

        String proccesses1;
        while (true) {
            System.out.println("***************************************************");
            System.out.println(processes);
            System.out.print("Please Choosing a operation : ");
            proccesses1 = input.nextLine();
            if (proccesses1.equals("q")) {
                System.out.println("Exiting the Book Management System...");
                Thread.sleep(3000);
                System.out.println("Bye Bye :D ");
                break;
            } else if (proccesses1.equals("1")) {
                System.out.println("Reccommended Libraries");

                String operations = "\t 1-Bogaici Library\n"
                        + "\t 2-Fsm Library\n"
                        + "\t 3- Ataturk Library\n"
                        + "\t Exiting q ";
                System.out.println("***************************************************");

                String operation;
                while (true) {
                    System.out.println("***************************************************");

                    System.out.println(operations);
                    System.out.print("Please Choosing a library : ");
                    operation = input.nextLine();
                    if (operation.equals("q")) {
                        System.out.println("Exiting main menu...");
                        Thread.sleep(1000);
                        break;
                    } else if (operation.equals("1")) {
                        Book book = new Book(operation, operation, operation, processes, 0, operation);
                        RecommendedLibraries library = new RecommendedLibraries(book, " Hisarüstü, Nispetiye Caddesi, Rumelihisarı, Sarıyer/İstanbul Türkiye",
                                "http://www.library.boun.edu.tr/", "0212 359 54 00");
                        library.bogaziciLibrary();
                        System.out.println("***************************************************");

                    } else if (operation.equals("2")) {
                        Book book1 = new Book(operation, operation, operation, processes, 0, operation);
                        RecommendedLibraries library1 = new RecommendedLibraries(book1, " Topkapı Yerleşkesi Merkezefendi Mah."
                                + "Mevlevihane Cad. Yenikapı Mevlevihanesi"
                                + " No:25 Zeytinburnu / İstanbul ",
                                "http://kutuphane.fsm.edu.tr/", "0212 521 81 00");
                        System.out.println("***************************************************");
                        library1.fsmLibrary();
                    } else if (operation.equals("3")) {
                        Book book2 = new Book(operation, operation, operation, processes, 0, operation);
                        RecommendedLibraries library2 = new RecommendedLibraries(book2, " Miralay Şefik Bey Sok. No: 6  Taksim, Beyoğlu - İstanbul",
                                " http://ataturkkitapligi.ibb.gov.tr/ataturkkitapligi/index.php", "0 212 249 09 45");
                        library2.ataturkLibrary();
                        System.out.println("***************************************************");
                    }
                }

            } else if (proccesses1.equals("2")) {
                System.out.println("Creating Book Management System");
                CreatingBookManagementSystem creat = new CreatingBookManagementSystem(processes, proccesses1, processes,
                        processes, processes, proccesses1, 0);
                creat.application_processes();
                System.out.println("***************************************************");
                boolean exit = false;

                int operation;
                while (!exit) {
                    System.out.println("***************************************************");
                    System.out.print("Please enter a operation : ");
                    operation = input.nextInt();

                    switch (operation) {
                        case 0:
                            creat.application_processes();
                        case 1:
                            creat.showBooks();
                            break;
                        case 2:
                            creat.addBooks();
                            break;
                        case 3:
                            creat.updateBooks();
                            break;
                        case 4:
                            creat.deleteBooks();
                            break;
                        case 5:
                            creat.searchBooks();
                            break;
                        case 6:
                            exit = true;
                            System.out.println("Exiting main menu..");
                            break;
                        default:
                            System.out.println("Aplication has not founded this operation");

                    }

                }

            }
        }
    }
}
