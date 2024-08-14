import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++)
        {
           if(numbers[i]==x){
            System.out.println("x found in index="+ i);
           }
        }
    }
}

//Take an array of number as input from the user and print them on the screen.
