package Inheritance;

public class VehicleMain {

    public static void main(String[] args) {

        VehicleParent info= new VehicleParent("Car ", 232444);
        info.vehicleInfo();

        TruckChild allinfo1= new TruckChild("Bus", 4553445, "P120");
        allinfo1.vehicleInfo();

        BusChild allinfo2= new BusChild("Truck", 768978, "P234", 234);
        allinfo2.vehicleInfo();
    }
}
