import java.util.*;
public class function_multiplication {

    public static int multiplication(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();
         int b = scan.nextInt();


         int product= multiplication(a, b);
         System.out.println(product);
    }
}

//make a fuuntion to multiply 2 numbers and return th product