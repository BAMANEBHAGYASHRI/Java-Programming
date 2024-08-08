package EXERCISE;
import java.util.*;
public class Exrecise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x=sc.nextInt();
        int y = sc.nextInt();
        int gcd=1;


        for(int i=1; i<=x && i<=y; i++){
            if(x%1==0 && y%1==0){
                gcd=i;
            }
            System.out.printf("gcd"+x,y,gcd);
        }
    }
}
//fucntion that claculate the gretest common divisor of 2 number
