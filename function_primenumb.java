import java.util.*;
public class function_primenumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(isprime(number)){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
        
    }
    static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if((num%i)==0){
                return false;
            }
        }
        return false;
    }
}
