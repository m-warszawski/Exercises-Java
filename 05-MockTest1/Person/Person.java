public class Person{

    private String name;
    private int age;

     public Person(String name, int age){
        this.name = name;
        this.age = age;
     }

     public void setName(String name){
        this.name = name;
     }

     public String getName(){
        return name;
     }

     public void setAge(int age){
        this.age = age;
     }

     public int getAge(){
        return age;
     }

     public boolean isAdult(){
        if (age>=18){
            return true;
        }
        else{
            return false;
        }
     }

     public String toString(){
        return getName()+','+getAge();
     }
}