package Abstract;

public class TriangleChild extends ShapeParent {


    public TriangleChild(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Trangle");

    }
}
