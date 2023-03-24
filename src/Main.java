import Library_manage.Book;
import Library_manage.BookDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Library_manage.BookDao.insertBook;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WellCome to Library ");
        while (true){
            System.out.println("press 1 - Add Book \n 2 - issue Book \n 3- Show All books");
int c= Integer.parseInt(br.readLine());

            switch (c){
                case 1:
                   //Add book in library
                    System.out.println("Enter Book name and Author of a book");
                    String name= br.readLine();
                    String author= br.readLine();
                    Book b1= new Book(name,author);
                    b1.toString();
                   boolean b = insertBook(b1);
                 if (b){
                     System.out.println("Book aDDED successfully");

                 }
                 else {
                     System.out.println("Something went wrong ");
                 }
                    break;
                    case 2:
                        System.out.println("Enter Id of the Book ");
                        int id=Integer.parseInt(br.readLine());
                       boolean b2= BookDao.issueBook(id);
                       if (b2){
                           System.out.println("Book issued successfully");
                       }
                       else {
                           System.out.println("Something went wrong ");


                       }
                    break;
                    case 3:
                        BookDao.showBooks();

                    break;

            }
        }
    }
}