package Lab2new;

class methodover {
    int a,b,c,d,e;
    double subtract(double a, double b) {
       return a-b;
    }
    int subtract(int a, int b) {
        return a-b;
    }
    int subtract(int a, int b, int c, int d, int e) {
        return (a-b)-c+(d-e);
    }
}
public class Q6 {
    public static void main (String[] args) {
        methodover m1 = new methodover();
        System.out.println("Subtraction 1: "+ m1.subtract(3.80,6.83));
        System.out.println("Subtraction 2: "+ m1.subtract(3,2));
        System.out.println("Subtraction 3: "+ m1.subtract(3,2, 11, 8,3));

    }
}
