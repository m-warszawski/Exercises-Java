public class Publisher{

    private String name;
    private String city;

    public Publisher(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String c){
        this.city = c;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
    }
}