package Lab2new;
import java.util.*;

class Rectangle {
    int length, breadth;
    Rectangle() {
        length =0;
        breadth=0;
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth= breadth;
    }
    int area(){
        return length*breadth;
    }
}
public class constructorOverload {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Using default constructor: "+r1.area());


        System.out.println("Enter the length and breadth: ");
        int l=sc.nextInt();
        int b=sc.nextInt();

        Rectangle r2 = new Rectangle(l,b);
        System.out.println("Using parameterized constructor: "+ r2.area());

    }

}
