package factoryDesignPattern;

public class Rectangle implements Shape{
    private int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with width " + width + " height " + height);
    }
}
