package vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vF = new VehicleFactory();
        Vehicle motor = vF.createVehicle("motorcycle");
        Vehicle car = vF.createVehicle("car");
        
        //contoh gas pada kelas car
        System.out.println("Gas di kelas Car : ");
        for (int i = 0; i < 11; i++) {
            car.gas();
        }
        
        //contoh gas pada kelas motorcycle
        System.out.println("Gas di kelas Motorcycle :");
        for (int j = 0; j < 11; j++) {
            motor.gas();
        }
        
        //contoh brake pada kelas car
        System.out.println("Brake di kelas Car :");
        car.brake();
        
        //contoh brake pada kelas motorcycle
        System.out.println("Brake di kelas Motorcycle :");
        motor.brake();
    }
}
