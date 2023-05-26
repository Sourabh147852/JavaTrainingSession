package Try;

import java.util.Scanner;

public class Try {
    private String username;
    private int accountNumber;

    public Try(String username, int accountNumber) {
        this.username = username;
        this.accountNumber = accountNumber;
    }

    public void checkLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a random letter: ");
        String input = scanner.nextLine();

        char randomLetter = 'A'; // Replace 'A' with your desired random letter

        if (input.length() > 0 && input.charAt(0) == randomLetter) {
            System.out.println("Username: " + username);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Try bank = new Try("John Doe", 1234567890);
        bank.checkLetter();
    }
}