public class Writer{
    protected String name;
    protected String surname;
    protected String category;

    public Writer(String name, String surname, String category){
        this.name = name;
        this.surname = surname;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Category: "+category);
    }
}

