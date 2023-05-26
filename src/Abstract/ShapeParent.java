package Abstract;

public abstract class ShapeParent {
    String name;
    public ShapeParent(String name ){

        this.name=name;
    }
    public abstract void draw();
}
