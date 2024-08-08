import java.util.*;
public class function_Sum {

    public static int sumation(int a , int b){
            int sum=a+b;
            return sum;
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();


         int sum= sumation(a, b);
         System.out.println(sum);
    }
}


//make a fuuntion to add 2 numbers and return th sum