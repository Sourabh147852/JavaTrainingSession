import java.util.Scanner;

public class Vehicle {
    private String vname1 = "Car";
    private String vname2 = "Bus";
    private int wheelsnum1 = 4;
    private int wheelsnum2 = 8;
    private int passcoun1 = 5;
    private int passcoun2 = 14;
    private String vtype1 = "Petrol";
    private String vtype2 = "Petrol";

    private Scanner sc = new Scanner(System.in);

    public void vehiclfirest1() {
        System.out.println(vname1);
        System.out.println(wheelsnum1);
        System.out.println(passcoun1);
        System.out.println(vtype1);
    }

    public void vehiclfirest2() {
        System.out.println(vname2);
        System.out.println(wheelsnum2);
        System.out.println(passcoun2);
        System.out.println(vtype2);
    }
}
