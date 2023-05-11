package Abstract;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        ShapeParent shape=null;
        Scanner sc= new Scanner(System.in);
        System.out.println("Which shape do you want to print");
        String shapeType= sc.next();

        if(shapeType.equals("Triangle")) {
            shape = new TriangleChild("My Triangle");
        }else if (shapeType.equals("Square")) {
            shape = new TriangleChild("My Square");
        }else {
            System.out.println("Its not a vaid input");
        }

        if (shape!=null) {
            shape.draw();
        }

    }
}
