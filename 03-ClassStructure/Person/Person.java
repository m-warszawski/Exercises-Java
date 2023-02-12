public class Person
{
    String Name;
    double Weight;
    double Height;

    Person(String name) {
        Name = name;
    }

    Person(String name, double weight, double height) {
        Name = name;
        setWeightAndHeight(weight, height);
    }

    public void setWeightAndHeight(double weight, double height)
    {
        Weight = weight;
        Height = height;
    }

    public double calculateBMI()
    {
        return Weight/(Height*Height) * 10000;
    }

    public void displayRecord()
    {
        System.out.println("Name: " + Name);
        System.out.println("Weight: " + Weight);
        System.out.println("Height: " + Height);
        System.out.println("-------------------");
        double BMI = calculateBMI();
        System.out.println("BMI: " + BMI);

        if(BMI < 18.5){
            System.out.println("BMI too low!");
        }
        else if(BMI > 24.9){
            System.out.println("BMI too high!");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Mateusz");
        p1.setWeightAndHeight(182,194);
        Person p2 = new Person("Maciek", 95, 188);

        p1.displayRecord();
        p2.displayRecord();
    }
}
