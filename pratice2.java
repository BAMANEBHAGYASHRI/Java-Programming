//ask the  user to enter the number of the month and print the name of the month
import java.util.*;
public class pratice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("print the number of month");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("january");
                break;
            
            case 2:
                System.out.println("fabruary");
                break;
            
            case 3:
                System.out.println("march");
                break;
            
            case 4:
                System.out.println("april");
                break;
            
            case 5:
                System.out.println("may");
                break;
            
            case 6:
                System.out.println("june");
                break;
            
            case 7:
                System.out.println("july");
                break;
            
            case 8:
                System.out.println("augest");
                break;
            
            case 9:
                System.out.println("septmeber");
                break;
            
            case 10:
                System.out.println("octomber");
                break;
            
            case 11:
                System.out.println("november");
                break;
            
            case 12:
                System.out.println("december");
                break;
            
            default:
            System.out.println("INvalid");

        }
    }
}
