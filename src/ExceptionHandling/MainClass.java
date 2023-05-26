package ExceptionHandling;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception{
        MailValidatorUtil mailValidatorUtil = new MailValidatorUtil();
        System.out.println("Please enter your email id");
        Scanner sc = new Scanner(System.in);
        String mail = sc.next();
//        try {
        mailValidatorUtil.validateMail(mail);
//        } catch (Exception e) {
//            System.out.println("Please enter a valid mail");
//        }
    }
}