package factoryDesignPattern;

public class Circle implements Shape{
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius " + this.radius);
    }
}
