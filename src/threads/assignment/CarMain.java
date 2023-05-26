package threads.assignment;

public class CarMain {
    public static void main(String[] args) throws InterruptedException {
        Car c1= new Car("C1");
        Car c2= new Car("C2");
        Car c3= new Car("C3");
        Car c4= new Car("C4");

        System.out.println("Starting Thread");
        c1.start();
        c2.start();
        c3.start();
        c4.start();



    }
}

