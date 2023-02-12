public class Car extends Vehicle {

    private int maxSpeed;

    public Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] car = new int[2];
        car[0] = getSeats();
        car[1] = maxSpeed;

        return car;
    }

    public static void main(String[] args){
        Car c = new Car(5, 120);
        int[] arr = c.spec();

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
