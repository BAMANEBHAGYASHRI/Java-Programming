import java.util.*;
public class pratice {
    public static void main(String[] args) {
        // try to declare meaninful variable named age shuld be a numeric type not byte
        // int age=21;
        // System.out.println(age);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Age");
        // int a=sc.nextInt();
        // System.out.println("your age"+a);

        //make a program that takes the radius of circle  as input calculate its radius and area and prints its output to the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cicle");
        int radius=sc.nextInt();
        double pi=3.14, area;
        area = pi * radius * radius;
        System.out.println("radius of circle"+area);


    }
}
