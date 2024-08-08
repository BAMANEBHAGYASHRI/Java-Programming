package EXERCISE;
import java.util.*;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result*=base;
        }
        System.out.println("result"+result);
    }
}
//two number are entered by the user , x and n. write a function to find the 
// value of one num raised to th power of amter
