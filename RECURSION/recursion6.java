package RECURSION;

public class recursion6 {
    public static int printpower(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int y=printpower(x, n-1);
        int z= x*y;
        return z;
    }
    public static void main(String[] args) {
        int x=2; int n=5;
        int op = printpower(x, n); 
        System.out.println(op);
    }
}
//Print x^n (with stack height = n)