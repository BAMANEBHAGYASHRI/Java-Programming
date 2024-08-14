import java.util.*;
public class Array_Pratice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

       int min=Integer.MIN_VALUE;
       int max = Integer.MAX_VALUE;

        //output
        for(int i=0; i<numbers.length; i++)
        {
           if(numbers[i]<min){
            min=numbers[i];
           }
           if(numbers[i]>max){
            max=numbers[i];
           }
        }
        System.out.println("Largest number is : " + min);
        System.out.println("Smallest number is : " + max);
 
    }
}

//Find the maximum & minimum number in an array of integers. 