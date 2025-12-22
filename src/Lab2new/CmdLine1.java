public class CmdLine1 {
    public static void main (String[] args) {
        int counteve= 0, countodd= 0;
        for (int i=0; i<=10; i++){
            int num= Integer.parseInt(args[i]);
            if(num %2 ==0) {
                counteve++;
            } else {
                countodd++;
            }
        }
        System.out.println("The number of even numbers= " +counteve);
        System.out.println("The number of odd numbers = " +countodd);
    }
}
