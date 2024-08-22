import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
       //declaration
        // String name="Bhagyashri";

        //taking input
        // Scanner sc = new Scanner(System.in);
        // //next()-take only single word
        // //nextLine()-take sentences
        // String name= sc.nextLine();
        // System.out.println(name);

        //concatentation
        String fname="shruti";
        String lname="bamane";
        String fullname=fname+ " "+lname;
        // System.out.println(fullname);

        //print length of string
        // System.out.println("length of string - "+ fullname.length());

        //access charachter of a string

        //charAt()-- Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
        for(int i=0; i<fullname.length();i++){
            // System.out.println(fullname.charAt(i));
        }

        //campare 2 strings
        //method-1
        // if(fname.equals(lname)){
        //     System.out.println("they are the same string");
        // }
        // else{
        //     System.out.println("they are the diffrent string");
        // }
        //method-2
        if(fname == lname){
            System.out.println("they are the same string");
        }
        else{
            System.out.println("they are the diffrent string");
        }

        //substring
        System.out.println(fname.substring(0,6));


    
    }
}
