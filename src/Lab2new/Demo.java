import java.util.*;
class Box{
    int length, width, height;
    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    int volume() {
        return length*width*height;
    }
}
public class Demo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the box: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();

        Box b1 = new Box(length, width, height);

        System.out.println("The volume of the box: " + b1.volume());
    }
}
