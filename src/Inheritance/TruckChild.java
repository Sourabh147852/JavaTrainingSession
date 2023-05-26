package Inheritance;

    public class TruckChild extends VehicleParent{

//   String name =null; (while using extends key word in TruckChild class its inheriting
//   int number=0;       properties and behaviors of VehicleParent class there we consider that now we have
//                       name and number variable in this class)
    String load_capacity=null;
    //TruckChild is a constractor
    public TruckChild(String vn, int rnum, String lc ){
            super(vn, rnum);
            this.load_capacity=lc;
        }
    public void vehicleInfo(){
        System.out.println("Vehicle name is " +name+" and Vehicle Registration number is " +number+" Load Capacity is " +load_capacity);

    }



}

