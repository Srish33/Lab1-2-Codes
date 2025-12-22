import java.util.*;
class Rectangle {
    double length, breadth, area, perimeter;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        return 0;
    }
    double calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        return 0;
    }
    double display () {
        System.out.println("The Area of the rectangle is "+area);
        System.out.println("The Perimeter of the rectangle is "+perimeter);
        return 0;
    }
}
    public class q4 {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(2,3);
            r1.read();
            r1.calculate();
            r1.display();

        }
}
