public class Smartphone
{
    String producer;
    String model;
    String year;
    boolean isWifiOn;
    int memorySize;

    public void changeWifiStatus(){
        if(this.isWifiOn == false{
            this.isWifiOn = true;
        }
        else{
            this.isWifiOn = false;
        }
    }

    public void setModel(Strin model){
        this.model = model;
    }

    public void displayMemorySize(){
        System.out.println(this.memorySize);
    }
}