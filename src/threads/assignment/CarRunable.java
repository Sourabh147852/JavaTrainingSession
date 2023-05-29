package threads.assignment;

public class CarRunable implements Runnable {

    private String name;
    public CarRunable(String name) {
        this.name = name;
    }
    @Override
    public void run() {

        for (int i=0; i<10; i++){
            System.out.println("Printing number"+i+"from thread"+name);
        }
    }
}
