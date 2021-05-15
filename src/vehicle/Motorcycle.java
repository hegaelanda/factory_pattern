package vehicle;

public class Motorcycle implements Vehicle {
    private int speed = 0;
    
    @Override
    public void gas(){
        if (speed < maxSpeed) {
            speed += 10;
            System.out.println("Speed up the motorcycle to " + speed + " Km/h");
        }else{
            System.out.println("Maximum speed");
        }
    }
    @Override
    public void brake(){
        if (speed == 0) {
            System.out.println("The motorcycle stops");
        }else{
            speed -= 10;
            System.out.println("Slow down the motorcycle to " + speed + " Km/h");
        }
    }
}
