public class Ebook extends Book{
    private String fileName;

    public Ebook(String title, String author, int year, Publisher publisher, String fileName) {
        super(title, author, year, publisher);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
        System.out.println("Filename: "+fileName);
    }

}
