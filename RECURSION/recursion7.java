package RECURSION;

public class recursion7 {
    public static int powerprint(int x , int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return powerprint(x, n/2) * powerprint(x, n/2);
        }
        else{
             return x * powerprint(x, n/2) * powerprint(x, n/2);
        }
    }
    public static void main(String[] args) {
        int x=2 ; int n=5;
        int op=powerprint(x, n);
        System.out.println(op);
        
    }
}
//Print x^n (with stack height = logn)
