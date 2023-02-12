public class Test{
    public static void main(String[] args){
        Person p1 = new Person("Anna",21);
        System.out.println(p1.getAge());
        System.out.println(p1.isAdult());
        p1.setAge(17);
        System.out.println(p1.isAdult());
        System.out.println(p1.toString());
    }
}