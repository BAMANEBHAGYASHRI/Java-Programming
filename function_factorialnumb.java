import java.util.*;
public class function_factorialnumb {

    public static void factorialnumb(int n){
        // for negative number
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
            
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        factorialnumb(n);
    }
}

//calculate factorial