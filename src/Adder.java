import java.util.Scanner;

    public class Adder {
    private int hindi=0;
    private int english=0;
    private Scanner scanner= new Scanner(System.in);

        //constructor
    public Adder (int i1, int i2){
        this.hindi= i1;
        this.english=i2;

    }
    public Adder(int hindi){
        this.hindi=hindi;
        this.english=hindi;
    }
    public void markeshindi() {
    //    System.out.println("Enter Hindi Markes");
    //   hindi = scanner.nextInt();
    }public void markesenglis(){
        System.out.println("Enter English Markes");
        english=scanner.nextInt();
    }
    public void markesofsum() {
        System.out.println(hindi + english);
    }
    }

