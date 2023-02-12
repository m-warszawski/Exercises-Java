public class SMS extends Message {
    
    private String number;
    

    public SMS(String number) {
        this.number = number;
    }

    public SMS(String text, String number) {
        super(text);
        this.number = number;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void send(){
        System.out.println("SMS Sending...");
        System.out.println("_____________________________________________");
        System.out.println("Phone number: " + number);
        System.out.println("Message: " + getText());
        System.out.println("_____________________________________________");
    }    

}
