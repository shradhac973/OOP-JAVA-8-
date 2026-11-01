package lab_sheet_8.Q02;

public class RectangleBeanMain {
    public static void main(String[] args) {
        RectangleBean rectangle = new RectangleBean(8, 5);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
