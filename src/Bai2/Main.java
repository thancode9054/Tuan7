package Bai2;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        double circleArea = circle.area();
        double circlePerimeter = circle.perimeter();

        double rectangleArea = rectangle.area();
        double rectanglePerimeter = rectangle.perimeter();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);
    }

}
