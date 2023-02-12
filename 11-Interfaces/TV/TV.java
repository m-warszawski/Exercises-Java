public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{

    private boolean state;
    private int channel;
    private int volume;

    public TV(){
        this.state = false;
        this.channel = 1;
        this.volume = 1;
    }

    public void on(){
        this.state = true;
        this.channel = 1;
    }

    public void off(){
        this.state = false;
    }

    public void display(){
        System.out.println("---");
        System.out.println("Tv state: "+state);
        System.out.println("Channel number: "+ channel);
        System.out.println("Volume level: "+ volume);
    }

    public void setChannel(int channelNo){
        if(this.state == true && channelNo < 99 && channelNo > 0) {
            this.channel = channelNo;
        }
    }

    public void channelUp(){
        if(this.state) {
            if(this.channel+1 > 99){
                this.channel = 1;
            }
            else{
                this.channel++;
            }
        }
    }

    public void channelDown(){
        if(this.state) {
            if (this.channel - 1 < 1) {
                this.channel = 99;
            } else {
                this.channel--;
            }
        }
    }

    public void volumeUp(){
        if(this.state) {
            if(this.volume+1 <= 10){
                this.volume++;
            }
        }
    }

    public void volumeDown(){
        if(this.state) {
            if (this.volume - 1 > 0) {
                this.volume--;
            }
        }
    }

}
