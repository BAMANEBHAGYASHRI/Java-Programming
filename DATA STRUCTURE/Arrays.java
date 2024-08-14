import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int marks [] = new int[3];
        // marks[0] = 40;
        // marks[1] = 70;
        // marks[2] = 90;
        //System.out.println(marks[0]);
        Scanner  sc = new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        //input
        for(int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++)
        {
            System.out.println(numbers[i]);
        }


        //second method for calling values in array
        // for(int i =0; i<3; i++){
        //     System.out.println(marks[i]);
        // }
        
    }
}
