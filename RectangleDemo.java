import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;
    double area;
    double perimeter;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        breadth = scanner.nextDouble();
    }

    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.read();
        rect.calculate();
        rect.display();
    }
}
