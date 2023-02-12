    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;


class StudentGrades
{
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;

        double[] tempArray = new double[numberOfGrades];
        this.grades = tempArray;

        double[] gradesArray = {2.0, 3.0, 3.5, 4.5, 5.0};
        for(int i=0; i<(numberOfGrades); i++){
           int nr = (int)(Math.random() * 5);
            this.grades[i] = gradesArray[nr];
        }
    }

    StudentGrades(String name) {
        this.studentName = name;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nIle ocen dla ucznia "+name+" chcesz dodać? ");
        int arrayLength = Integer.parseInt(scan.nextLine());

        double[] tempArray = new double[arrayLength];
        System.out.println("Podaj oceny po każdej klikając ENTER");
        for(int i=0; i<arrayLength; i++) {
            tempArray[i] = Double.valueOf(scan.nextLine());
        }

        this.grades = tempArray;
    }

    public double lowestGrade()
    {
        double temp = grades[0];
        for(int i=0; i<grades.length; i++){
            if(grades[i]<temp){
                temp = grades[i];
            }
        }
        return temp;
    }

    public double highestGrade()
    {
        double temp = grades[0];
        for(int i=0; i<grades.length; i++){
            if(grades[i]>temp){
                temp = grades[i];
            }
        }
        return temp;
    }

    public int numberOfGrades()
    {
        return grades.length;
    }

    public double gradePointAverage()
    {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public void displayRecord()
    {
        System.out.println();
        System.out.println("Student's name: "+studentName);
        System.out.println("Student's grades: "+Arrays.toString(grades));
        System.out.println("Number of grades: "+numberOfGrades());
        System.out.println("Lowest grade: "+lowestGrade());
        System.out.println("Highest grade: "+highestGrade());
        System.out.println("Grade point average: "+gradePointAverage());
    }

    public static void main (String[] args)
    {
        double[] amandaGrades = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades sg1 = new StudentGrades("Amanda", amandaGrades);
        sg1.displayRecord();

        double[] jamesGrades = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades sg2 = new StudentGrades("James", amandaGrades);
        sg2.displayRecord();

        StudentGrades sg3 = new StudentGrades("Michal", 10);
        sg3.displayRecord();

        StudentGrades sg4 = new StudentGrades("Tomek");
        sg4.displayRecord();
    }

}