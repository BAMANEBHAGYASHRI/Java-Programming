package RECURSION;

public class recursion1 {
    public static void printnumbers(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        printnumbers(n-1);
       
    }
    public static void main(String[] args) {
        int n=5;
        printnumbers(n);
       
    }
}
//print number from 5 to 1