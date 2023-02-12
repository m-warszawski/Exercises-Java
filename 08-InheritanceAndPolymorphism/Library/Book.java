public class Book {
    protected String title;
    protected String author;
    protected int year;
    protected Publisher publisher;

    public Book(String title, String author, int year, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println("Tytuł: "+title);
        System.out.println("Autor: "+author);
        System.out.println("Year: "+year);
        System.out.println("-> Publisher");
        publisher.display();
    }

}
