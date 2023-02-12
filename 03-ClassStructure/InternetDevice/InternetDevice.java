public class InternetDevice
{
    String name;
    boolean connected;
    static  int connectedDevices;

    InternetDevice(String name)
    {
        this.name = name;
    }

    public void connect()
    {
        connected = true;
        connectedDevices++;
    }

    public void disconnect()
    {
        connected = false;
        connectedDevices--;
    }

    public boolean idConnected()
    {
        return connected;
    }

    public void displayStatus()
    {
        System.out.println("Device name: "+name);
        System.out.println("Is connected: "+connected);
        System.out.println("--------------------------------");
    }

    public static void displayConnections()
    {
        System.out.println("->Connected devices: "+connectedDevices);
    }

    public static void main(String[] args)
    {
        InternetDevice id1 = new InternetDevice("Telefon");
        id1.connect();
        InternetDevice id2 = new InternetDevice("Telewizor");
        id2.connect();
        InternetDevice id3 = new InternetDevice("Laptop");
        id3.connect();
        InternetDevice id4 = new InternetDevice("Tablet");
        InternetDevice id5 = new InternetDevice("Wieża");

        id1.displayStatus();
        id2.displayStatus();
        id3.displayStatus();
        id4.displayStatus();
        id5.displayStatus();

        id5.displayConnections();
    }
}