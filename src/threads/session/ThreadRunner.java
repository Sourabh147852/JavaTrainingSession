package threads.session;

public class ThreadRunner {
    public static void main(String[] args)throws InterruptedException {
        MyThread t1= new MyThread("t1");
        MyThread t2= new MyThread("t2");
        MyThread t3= new MyThread("t3");

        System.out.println("Starting thread t1 and "+"t2 and t3");
        t1.start();
        t2.start();
        t3.start();


        Thread.sleep(9);
        System.out.println("t1 and t2 and "+"t3 started");
    }
}
