public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        String txt = "" + name.charAt(0) + surname.charAt(0);
        txt = txt.toUpperCase();
        return txt;
    }

    public static void main(String[] args){
        Person p1 = new Person("anna","may");
        System.out.println(p1);
    }
}

