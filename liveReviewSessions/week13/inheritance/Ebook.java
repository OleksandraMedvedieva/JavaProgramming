package week13.inheritance;

public class Ebook extends Book{
    protected int sizeAtMemory;
    protected int pages;
/*
    public Ebook(String title, String type, String author, double price,int sizeAtMemory,int pages){
        super( title,  type,  author,  price);
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }

 */
public Ebook(){

}


    public void readBook(){
        System.out.println("reading the bok from my Tablet");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("sizeAtMemory = " + sizeAtMemory);
        System.out.println("type = " + type);
        System.out.println("sizeAtMemory = " + sizeAtMemory);
        System.out.println("pages = " + pages);
    }

}
