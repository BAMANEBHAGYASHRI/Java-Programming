package EXERCISE;

import java.util.*;
public class Exercise1 {
    public static void avarge(int a, int b, int c){
        int avg=a+b+c/3;
        System.out.println("avarage of = "+ avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        avarge(a, b, c);
        
        
    }
}
//enter 3 numbers from the user & make a function to print their averange.
