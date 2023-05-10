package Inheritance;

public class BusChild extends TruckChild{
    int passnumber=0;

    public BusChild(String vn, int rnum, String lc, int pcount){
        super(vn,rnum,lc);
        this.passnumber=pcount;
    }
    public void alllinfo(){
        System.out.println("Vehicle name is " +name+" and Vehicle Registration number is " +number+" Load Capacity is " +load_capacity +"Passenger count is "+passnumber );
    }
}
