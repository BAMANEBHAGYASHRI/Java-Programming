import java.util.*;
public class function_evennumber {
    public static void evennumber(int a ){
        if(a%2==0){
            System.err.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        evennumber(a);

    }
}
