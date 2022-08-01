package week13.inheritance;

public class BookStore {
    public static void main(String[] args) {

        Book book = new Book("1984", "Distopia", "George Orwell", 29.5);
        System.out.println("book = " + book);
        book.buy("D&R");
        book.borrow("Oscar");
        AudioBook audioBook = new AudioBook("Animal Farm","Fiction", "George Orwell",35,180,"Benjamin May" );
        System.out.println("audioBook = " + audioBook);
        audioBook.buy("BritishBook");
        audioBook.borrow("Amazon");
        audioBook.listen();



    }
}
