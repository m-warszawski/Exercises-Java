import java.util.Arrays;

public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number){
        this.beds = 2;
    }

    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }

    public void checkin(String guestName){
        if(isOccupied() == false){
            this.guestName = guestName;
            this.occupied = true;
        }
        else{
            System.out.println("Ten pokój jest już zajęty!");
        }
    }

    public void checkout(){
        this.guestName = "";
        this.occupied = false;
    }

    public boolean isOccupied(){
        return this.occupied;
    }

    public void displayStatus(){
        System.out.println("Room number: "+this.number);
        System.out.println("Beds: "+this.beds);
        System.out.println("Room number: "+this.occupied);
        System.out.println("Guest name: "+this.guestName);

    }

//    --------------------------------------------------

    public static void displayStatusOfRooms(Room[] rooms){
        for(int i=0; i<rooms.length; i++){
            rooms[i].displayStatus();
            System.out.println("-----------------");
        }
        System.out.println();
    }

    public static void displayVacantRooms(Room[] rooms){
        int occupiedRooms = 0;
        int vacantRooms = 0;
        for(int i=0; i<rooms.length; i++){
            if(rooms[i].isOccupied()){
                occupiedRooms++;
            }
            else{
                vacantRooms++;
            }
        }
        System.out.println("Number of occupied rooms: "+ occupiedRooms);
        System.out.println("Number of vacant rooms: "+ vacantRooms);
        System.out.println();
    }

    public static void displayLimitedListOfRooms(Room[] rooms, int beds){
        for(int i=0; i<rooms.length; i++){
            if(rooms[i].beds == beds) {
                rooms[i].displayStatus();
                System.out.println("-----------------");
            }
        }
        System.out.println();
    }

    public static void displayVacantBeds(Room[] rooms){
        int vacantBeds = 0;
        for(int i=0; i<rooms.length; i++){
            if(!rooms[i].isOccupied()){
                vacantBeds += rooms[i].beds;
            }
        }
        System.out.println("Number of vacant beds: "+ vacantBeds);
        System.out.println();
    }

    public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0] = new Room(10);

        rooms[1] = new Room(11);
        rooms[2] = new Room(12);
        rooms[3] = new Room(13,3);
        rooms[4] = new Room(14,3);
        rooms[5] = new Room(15,1);

//  a
        rooms[0].displayStatus();
        System.out.println();
//  b
        displayStatusOfRooms(rooms);
//  c
        displayLimitedListOfRooms(rooms, 2);
//  d
        displayVacantRooms(rooms);
//  e
        displayVacantBeds(rooms);

    }

}