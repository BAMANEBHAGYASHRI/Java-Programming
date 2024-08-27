package RECURSION;

public class recursion5 {
    public static void fibonacci(int a , int b, int c){
        if(c==0){
            return;
        }
        
        int n=a+b;
        System.out.println(n);
        fibonacci(b, a+b, c-1);
    }
    public static void main(String[] args) {
        int a=0;
        System.out.println("a-"+a);
        int b =1;
        System.out.println("b-"+b);
        int c=7;
        fibonacci(0, 1, c-2);
    }
}
//Print the fibonacci sequence till nth term.
