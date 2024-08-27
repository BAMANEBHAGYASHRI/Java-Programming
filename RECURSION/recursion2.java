package RECURSION;

public class recursion2 {
    public static void printnumb(int n){
        //base casee
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumb(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printnumb(n);

    }
    
}
//print number from 1 to 5