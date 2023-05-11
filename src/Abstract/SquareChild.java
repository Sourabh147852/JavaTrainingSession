package Abstract;

public class SquareChild extends TriangleChild {

    public SquareChild(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
