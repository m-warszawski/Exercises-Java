import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index){
        books.remove(index);
    }

    public void display(){
        System.out.println("---------------------------------------");
        for(int i=0; i<this.books.size(); i++){
            books.get(i).display();
            System.out.println("---------------------------------------");
        }
    }

    public static void main(String agrs[]){
        Library l1 = new Library();
        Publisher p1 = new Publisher("ZNAK", "Kraków");
        Audiobook a1 = new Audiobook("Mały Książe", "Antoinde de saint Exupery", 2002, p1, 15, 45);
        Ebook e1 = new Ebook("Mały Książe", "Antoinde de saint Exupery", 2002, p1, "maly-ksiaze");
        Book b1 = new Book("Mały Książe", "Antoinde de saint Exupery", 2002, p1);
        l1.addBook(a1);
        l1.addBook(e1);
        l1.addBook(b1);
        l1.display();
    }

}
