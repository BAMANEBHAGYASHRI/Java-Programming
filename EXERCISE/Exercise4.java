package EXERCISE;
import java.util.Scanner;
import java.lang.Math;
public class Exercise4 {   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double radius =sc. nextDouble();
       double circumference = calculatecircumference(radius);
       System.out.println("circle of cirrcumference"+ circumference);   


       calculatecircumference(radius);
    }

    public static double calculatecircumference(double radius){

        return 2* Math.PI * radius;
    }

}

//function that takes in the radius as input and return the circumference of a cricle
