import java.util.*;
class Rectangle {
    double length, breadth, area, perimeter;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);

    }
    void display () {
        System.out.println("The Area of the rectangle is "+area);
        System.out.println("The Perimeter of the rectangle is "+perimeter);

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
