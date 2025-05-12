package factoryDesignPattern;

public class NoDimensionEntity implements Shape{
    @Override
    public void draw() {
        System.out.println("No Dimension, so cant draw!");
    }
}
