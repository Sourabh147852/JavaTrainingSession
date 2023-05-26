package Practice;

import java.util.Scanner;

public class Bank {
    private String name = null;
    private int accountnum = 0;

    public Bank(String name, int accountnum) {
        this.accountnum = accountnum;
        this.name = name;
    }
    public void custmerinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first letter");
        char a = sc.nextLine().charAt(0);
        if (a == name.charAt(0)) {
            System.out.println("Your name is " + name + "Your account number is " + accountnum);
        } else {
            System.out.println("Hello");
        }
    }
}
