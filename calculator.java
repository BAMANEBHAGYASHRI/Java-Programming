import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cal = sc.nextInt();
        
        switch(cal){
            case 1:
                cal=a+b;
                System.out.println("addition"+cal);
                break;
            case 2:
                cal=a-b;
                System.out.println("substraction"+cal);
                break;
            case 3:
                cal=a*b;
                System.out.println("multiplication"+cal);
                break;
            case 4:
                cal=a/b;
                System.out.println("division"+cal);
                break;
            default:
            System.out.println("invalid");

        }
    }
}
