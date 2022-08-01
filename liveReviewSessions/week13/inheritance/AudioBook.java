package week13.inheritance;

public class AudioBook extends Book{
    protected int lengthOfRecording;
    protected String narrator;

    public AudioBook(String title, String type, String author, double price, int lengthOfRecording, String narrator) {
        super(title, type, author, price);
        this.lengthOfRecording = lengthOfRecording;
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println("Book is listening: " + title);
    }


    public String toString() {
        return "AudioBook{" +
                "lengthOfRecording=" + lengthOfRecording +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
