package EXERCISE;
import java.util.*;
public class Exercise7 {
    public static void main(String[] args) {
        int p=0 , n=0, z=0;
        System.out.println("press 1 to contiune & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();

        while(i==1){
            System.out.println("enter ur number");
            int num = sc.nextInt();
            if(num>0){
                p++;
            }
            else if(n<0){
                n++;
            }
            else{
                z++;
            }
        }
        System.out.println("press 1 to contiune & 0 to stop");
        i= sc.nextInt();

        System.out.println("positive"+p);
        System.out.println("negative"+n);
        System.out.println("zeros"+z);
    }
}



//program to enter the number till teh user wats and the end it should display the count of positive , negitive , and 0 entered,
