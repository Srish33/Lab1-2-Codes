package Lab2new;
import java.util.*;
class Student {
    long rollno;
    String name;
    double cgpa;
}
public class cgpa {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];

        double lowestcgpa = 10.00;
        String lowestName = "";
        for (int i=0;i<n;i++) {

            s[i] = new Student();
            System.out.println("Student " + (i+1) + ":");
            System.out.println("Enter the student's Roll No.: ");
            s[i].rollno = sc.nextLong();
            System.out.println("Enter the student's Name: ");
            s[i].name = sc.next();
            System.out.println("Enter the student's CGPA scored: ");
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < lowestcgpa){
                lowestcgpa = s[i].cgpa;
                lowestName = s[i].name;
            }
        }
        System.out.println(lowestName+" has lowest cgpa i.e: "+lowestcgpa);
    }
}
