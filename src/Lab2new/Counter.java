import java.util.Scanner;

class count {
    static int cnt =0;
    count() {
        cnt++;
    }
}
public class Counter {
    public static void main(String[] args) {
        count o1 = new count();
        count o2 = new count();
        count o3 = new count();

        System.out.println("Number of objects created: " +count.cnt);
    }
}
