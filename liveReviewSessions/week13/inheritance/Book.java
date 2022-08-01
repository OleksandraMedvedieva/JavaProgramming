package week13.inheritance;

public class Book {
    protected String title,type,author;
    protected double price;



    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }
    public Book(){

    }
    public void buy(String store){
        System.out.println("Buying it from: " + store);
    }
    public void borrow(String source){
        System.out.println("Borrowing if from: " + source);
    }
    public void lend(String user){
        System.out.println("Lending a book from: " + user);
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
