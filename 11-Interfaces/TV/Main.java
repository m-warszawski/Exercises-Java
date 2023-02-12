public class Main{

    public static void main(String[] args){
        TV tv1 = new TV();
//        tv1.on();
//        tv1.channelUp();
//        tv1.setChannel(7);
//        tv1.setChannel(142);
//        tv1.display();
//        tv1.channelDown();
//        tv1.display();
//        tv1.off();
//        tv1.display();

        tv1.on();
        tv1.display();
        tv1.setChannel(15);
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.display();
        tv1.off();
        tv1.display();
    }

}
