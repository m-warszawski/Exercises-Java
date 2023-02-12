import java.util.ArrayList;

public class Book {
    private int yearOfCreation;
    private String title;
    private int numberOfPages;
    ArrayList<String> categories = new ArrayList<String>();

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public Book(int yearOfCreation, String title, int numberOfPages, String[] categories, String content) {
        this.yearOfCreation = yearOfCreation;
        this.title = title;
        this.content = content;
        this.numberOfPages = numberOfPages;
        for (int id = 0; id < categories.length; id++) {
            addCategory(categories[id]);
        }

    }

    public void addCategory(String category) {
        categories.add(category);
    }

}