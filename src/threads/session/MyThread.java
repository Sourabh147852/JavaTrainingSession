package threads.session;

public class MyThread extends Thread{

    public MyThread(String name ) {
        setName(name);
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("printing number"+i+"From thread"+getName());

        }
    }
}
