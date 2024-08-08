package EXERCISE;
import java.util.*;
public class Exercise2 {
    public static void  oddnumb(int a){
       int sum=0;
       for(int n=1; n<=a; n++){
        if(n%2==1){
            // System.out.println(n);
            sum=sum+n;
        }
       }
       System.out.println("sum of all odd number ="+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        

    oddnumb(a);
     
        
        
    }
}

//function to print the sum of all odd numbers from to 1 to n
