package Inheritance;

public class VehicleMain {

    public static void main(String[] args) {

        VehicleParent info= new VehicleParent("Car ", 232444);
        info.VehicleInfo();

        TruckChild allinfo1= new TruckChild("Bus", 4553445, "P120");
        allinfo1.allinfo();

        BusChild allinfo2= new BusChild("Truck", 768978, "P234", 234);
        allinfo2.alllinfo();
    }
}
