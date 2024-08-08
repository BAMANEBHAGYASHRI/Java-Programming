package EXERCISE;
import java.util.*;
public class Exercise3 {
    public static void greaternumber(int a, int b){
       if(a>b){
        System.out.println("greater number"+a);
       }
       else{
        System.out.println("greater"+b);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greaternumber(a, b);
        
        
    }
}
//function which takes in 2 numbers and return the greter of those two.