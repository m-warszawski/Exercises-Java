public class Clock
{
    int hour;
    int minutes;
    int alarmHour;
    int alarmMinutes;
    boolean isAlarm = false;

    Clock(){
        this.hour = 0;
        this.minutes = 0;
    }

    Clock(int hour, int minutes){
        this.hour = hour;
        this.minutes = minutes;
    }

    public void setClock(int hour, int minutes){
        this.hour = hour;
        this.minutes = minutes;
    }

    public void setClock(){
        this.hour = 0;
        this.minutes = 0;
    }

    public void displayTime(){
        String displayHour = String.valueOf(this.hour);
        String displayMinutes = String.valueOf(this.minutes);

        if(displayHour.length()<2){
            displayHour = "0"+displayHour;
        }

        if(displayMinutes.length()<2){
            displayMinutes = "0"+displayMinutes;
        }

        System.out.println(displayHour+":"+displayMinutes);
    }

    public void addOneMinute(){
        int tempHour = this.hour;
        int tempMinutes = this.minutes;

        tempMinutes++;
        if(tempMinutes>59){
            tempHour++;
            tempMinutes=0;
        }

        if(tempHour>23){
            tempHour=0;
        }

        this.hour = tempHour;
        this.minutes = tempMinutes;

        if( isAlarm && (this.hour == this.alarmHour) && (this.minutes == this.alarmMinutes) ){
            runAlarm();
        }
    }

    public void setAlarm(int hour, int minutes){
        this.alarmHour = hour;
        this.alarmMinutes = minutes;
        this.isAlarm = true;
    }

    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!!");
    }

    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();

        c1.setAlarm(0, 1);
        c1.addOneMinute();
        c1.addOneMinute();
        c1.displayTime();
    }
}