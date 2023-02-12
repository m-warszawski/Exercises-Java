public class CinemaTicket
{
    private int x;
    String cinemaName = "";
    String filmTitle;
    int row;
    int seat;
    double price;

    CinemaTicket(String title, int row, int seat) {
        this.cinemaName = "Morning Star Cinema";
        this.filmTitle = title;
        this.row = row;
        this.seat = seat;

        if(Row <= 2 && Row > 0){
            Price = 10;
        }
        else{
            Price = 25;
        }
    }

    public void displayTicketDetails()
    {
        System.out.println("Ticket Details:");
        System.out.println(cinemaName);
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(seat);
        System.out.println(price);
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        CinemaTicket ct1 = new CinemaTicket("Gladiator",2,12);
        CinemaTicket ct2 = new CinemaTicket("Gladiator",7,3);

        System.out.println("====================================");
        ct1.displayTicketDetails();
        ct2.displayTicketDetails();
    }
}
