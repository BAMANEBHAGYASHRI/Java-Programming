import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("value for a-");
       int a = sc.nextInt();
       System.out.println("value for b");
       int b = sc.nextInt();
       if( a == b){
        System.out.println("equal numbers");
       }
       else if(a>b){
        System.out.println("a is greater");
       }
       else{
        System.out.println("a is lesser");
       }
    }
}
