package EXERCISE;
import java.util.*;
public class Exercise5 {
    public static  void votecounter(int age){

        if(age>18){
            System.out.println("ur eligible to vote");
        }
        else{
            System.out.println("ur not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt();


        votecounter(age);
    }
}
//function that takes in age as input and return if that person is eliogible to vote or not.