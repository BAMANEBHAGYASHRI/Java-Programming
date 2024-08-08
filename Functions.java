import java.util.*;
public class Functions {

    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        //function calling
        myname(name);
    }
}


//print the given name in function