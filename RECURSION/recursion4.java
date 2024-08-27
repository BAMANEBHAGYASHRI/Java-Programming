package RECURSION;

public class recursion4 {
    public static void factorial(int n ,int fact){
      
        if(n==0){
            System.out.println(fact);
            return;
        }
        // System.out.println(n);
        fact*=n;
        factorial(n-1, fact);
    }
    
    public static void main(String[] args) {
       factorial(5, 1);
    }
}

//Print factorial of a number n.
