import java.util.Scanner;

public class MethodJava {
    private int a=0;
    private int b=0;
    private Scanner sc= new Scanner(System.in);
    public void input1(){
            System.out.println("Enter a number");
            a= sc.nextInt();
       }
        public void input2() {
            System.out.println("Enter second number");
            b= sc.nextInt();
        }

        public void sumOfNumber(){
            int sum=a+b;
            System.out.println(sum);
        }
        public void mutiPlication(){
            int multi=a*b;
             System.out.println(multi);
    }
    }

