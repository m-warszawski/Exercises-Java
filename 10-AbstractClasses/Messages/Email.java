public class Email extends Message {
    
    private String subject;
    private String recipient;

    
    public Email(String subject, String recipient) {
        this.subject = subject;
        this.recipient = recipient;
    }

    public Email(String text, String subject, String recipient) {
        super(text);
        this.subject = subject;
        this.recipient = recipient;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void send(){
        System.out.println("Email Sending...");
        System.out.println("_____________________________________________");
        System.out.println("Recipient address: " + recipient);
        System.out.println("_____________________________________________");
        System.out.println("Subject: " + subject);
        System.out.println("_____________________________________________");
        System.out.println("Message: " + getText());
        System.out.println("_____________________________________________");
    }    

}
