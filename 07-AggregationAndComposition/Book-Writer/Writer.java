import java.util.ArrayList;

public class Writer {
    private String name;
    private boolean isAlive;
    private String nationality;
    ArrayList<Book> books = new ArrayList<Book>();

    public void createBook(int yearOfCreation, String title, int numberOfPages, String[] categories, String content){
        books.add(new Book(yearOfCreation,title,numberOfPages,categories,content));
    }

}