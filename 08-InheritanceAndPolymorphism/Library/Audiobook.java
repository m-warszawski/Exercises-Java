public class Audiobook extends Book{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int year, Publisher publisher, int minutes, int seconds) {
        super(title, author, year, publisher);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){      
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
        System.out.println("Time: "+minutes+":"+seconds);
    }

}
