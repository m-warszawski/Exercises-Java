public class Lamp
{
    boolean isOn;


    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
    }

    public void displayInfo(){
        if(this.isOn){
            System.out.println("The lamp is ON");
        }
        else{
            System.out.println("The lamp is OFF");
        }
    }

    public static void main(String[] args){
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.switchOn();
        l2.switchOff();

        l1.displayInfo();
        l2.displayInfo();
    }
}