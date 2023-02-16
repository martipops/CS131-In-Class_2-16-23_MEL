public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calcArea();
        System.out.println("Area of circle with radius " + circle.getRadius() + " is " + area);
    }
}
