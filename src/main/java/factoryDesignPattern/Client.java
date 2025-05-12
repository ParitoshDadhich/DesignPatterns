package factoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.create("Circle", 10);
        Shape rectangle = ShapeFactory.create("Rectangle", 10, 20);
        Shape noDimension = ShapeFactory.create("NoDimension");
        //        Shape square = ShapeFactory.create("Squalre");

        circle.draw();
        rectangle.draw();
        noDimension.draw();
//        square.draw();
    }
}
