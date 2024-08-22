import java.util.*;
public class Exercise_Strings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String array[]=new String[size];
    int totallength=0;

    for(int i=0; i<size; i++){
        array[i]=sc.next();
        totallength += array[i].length();
    }
    System.out.println(totallength);



    }
}
//taking an array of strings input from the user and find the combined legth of all those strings
