package threads.assignment;

import threads.session.MyRunable;

public class CarRunnerMain {
    public static void main(String[] args) {
        MyRunable r1= new MyRunable("R1");
        MyRunable r2= new MyRunable("R2");
        MyRunable r3= new MyRunable("R3");

        Thread tr1= new Thread("TR1");
        Thread tr2= new Thread("TR2");
        Thread tr3= new Thread("TR3");
        System.out.println("Starting thread t1 and "+"t2 and t3");
        tr1.start();
        tr2.start();
        tr3.start();


        try {
            Thread.sleep(9);
        }catch (InterruptedException e){
            System.out.println("thread interrupted ");
        }
        System.out.println("t1 and t2 and "+"t3 started");
    }
}
