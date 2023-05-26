package threads.session;

public class MyRunable implements Runnable{
    private String name;

    public MyRunable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i=0; i<10; i++){
            System.out.println("Printing number"+i+"from thread"+name);
        }
    }
}
