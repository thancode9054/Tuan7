package Bai1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Circle circle = new Circle(5.0);

        double rectangleArea = rectangle.area();
        double circleArea = circle.area();

        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
    }
}
