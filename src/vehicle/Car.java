package vehicle;

public class Car implements Vehicle{
    private int speed = 0;
    
    @Override
    public void gas(){
        if (speed < maxSpeed) {
            speed += 10;
            System.out.println("Speed up the car to " + speed + " Km/h");
        }else{
            System.out.println("Maximum speed");
        }
    }
    @Override
    public void brake(){
        if (speed == 0) {
            System.out.println("The car stops");
        }else{
            speed -= 10;
            System.out.println("Slow down the car to " + speed + " Km/h");
        }
    }
}
