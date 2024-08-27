package RECURSION;

public class recursion3 {
    public static void sum_natural_num(int n ,int sum){
      
        if(n==0){
            System.out.println(sum);
            return;
        }
        // System.out.println(n);
        sum+=n;
        sum_natural_num(n-1, sum);
    }
    
    public static void main(String[] args) {
        sum_natural_num(5, 0);
    }
}
//Print the sum of first n natural numbers.