import java.util.Scanner;

class Central_library{
   private int ID;
    private String [] availBook={"0-Programming with Java" ,"1-Artificial Intelligence" , "2-Deep Learning ", "3-Arihant's GS" , "4-HC Verma" ,"5-Harry Potter"};
    private int  req_book;
    private  String [] isud_books=new String [10];

    private int count_books=0;
    private int days;
    Scanner input=new Scanner(System.in);

    public void show_library_books(){
        System.out.println("Available books are:");
        for (String books:availBook){
            System.out.printf("%s\n",books);
        }
    }

    public void issue_new_books() {
        System.out.printf("\nEnter your library ID:");
        ID=input.nextInt();
        System.out.printf("\nEnter no of books you want:");
        days = input.nextInt();

        for (int i = 0; i < days; i++) {

            System.out.printf("\nEnter book ID  of a book to be issued from library:");
            req_book = input.nextInt();
            if (req_book < availBook.length) {
                System.out.println("Book is Available to issue.");
                System.out.println("Book is issued at your ID "+ID+" for 15 days.");
                System.out.println("After 15 days fine of 5 rupees /- day will be charged.");
                isud_books[count_books] = availBook[req_book];
                count_books++;

            } else {
                System.out.println("Book is Not Available for now");
            }
        }
    }

    public void returnBooks(){
        int confrm=0;
        int uid;
        System.out.printf("Enter your library ID:");
        uid=input.nextInt();
        if (ID==uid) {
            System.out.println("Books Issued at your ID " + ID + " are");
            for (String books : isud_books) {
                if (books == null) {
                    continue;
                } else {
                    System.out.println(books);
                }
            }
            System.out.println("Do you want to return all these books?(press 1 )");
            confrm = input.nextInt();
            if (confrm == 1) {
                System.out.println("All books with your ID are returned successfully.");
                System.out.println("Thank you");
            } else {
                System.out.println("Thank you....for visiting");

            }
        }
        else {
            System.out.println("Sorry ID did not matched with our database.");
        }

    }
}


public class Library {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int ch;
        Central_library c1=new Central_library();
//        c1.show_library_books();
//        c1.issue_new_books();
//        c1.returnBooks();


        while (true){
            System.out.println("\n--------------------------------------------------------");
            System.out.println("\t\tLibrary Management System");
            System.out.println("--------------------------------------------------------");
            System.out.println("1>Show Available Books");
            System.out.println("2>Issue a Book from Library");
            System.out.println("3>Return a Book");
            System.out.println("4>Exit");
            System.out.println("--------------------------------------------------------");
            System.out.println("Enter your choice:");
            ch=input.nextInt();
//            System.out.println("---------------------------------------");
            if (ch==1){
                System.out.println("------------------------------------------------------");
                c1.show_library_books();
//                System.out.println("-------------------------------------");
            }
            else if (ch==2){
                System.out.println("------------------------------------------------------");
                c1.issue_new_books();
//                System.out.println("-------------------------------------");
            }
            else if (ch==3){
                System.out.println("------------------------------------------------------");
                c1.returnBooks();
//                System.out.println("---------------------------------");
            }
            else if (ch==4){
                System.out.println("\nExiting our program.....See you soon");
                break;
            }




        }



    }
}
