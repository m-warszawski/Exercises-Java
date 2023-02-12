import java.util.ArrayList;

public class Family{

    private ArrayList<Person> person;

    public Family(){
        this.person = new ArrayList<Person>();
    }

    public Family(ArrayList<Person> person){
        this.person = person;
    }

    public int adults(){
        int nr = 0;
        for(int i=0; i<person.size(); i++){
            if(person.get(i).getAge()>=18){
                nr++;
            }
        }
        return nr;
    }

    public static void main(String[] args){

        ArrayList<Person> person = new ArrayList<Person>();
        Person p1 = new Person("Ania", 40);
        Person p2 = new Person("Janek", 31);
        Person p3 = new Person("Kasia", 17);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        Family f1 = new Family(person);
        System.out.println(f1.adults());
    }

}

