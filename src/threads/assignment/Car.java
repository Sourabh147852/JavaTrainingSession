package threads.assignment;

public class Car extends Thread{
    public Car(String name) {
        setName(name);
    }

    @Override
    public void run() {
        System.out.println("Car "+getName()+ " reached destinatiom");
    }
}
