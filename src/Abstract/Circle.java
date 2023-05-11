package Abstract;

public class Circle extends SquareChild {
    public Circle(String name) {
        super(name);
    }
    public void draw(){
        System.out.println("Drawing Trangle");
    }
}
