package Inheritance;

public class VehicleParent {
    String name =null;
    int number=0;

    public VehicleParent(String vename, int vregisnum)
    {
        this.name=vename;
        this.number=vregisnum;
    }
    public void VehicleInfo(){
        System.out.println("Vehicle name is "+name+ "and Vehicle Registration number is "+number);
    }

}
