package vehicle;

public class VehicleFactory {
    public Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("motorcycle")){
            return new Motorcycle();
        }else if(type.equalsIgnoreCase("car")){
            return new Car();
        }else{
            return null;
        }
    }
}
