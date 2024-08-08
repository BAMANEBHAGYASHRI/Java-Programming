package EXERCISE;

public class Exercise10 {
    public static void main(String[] args) {
        int n1=0 , n2=1 , n3, i, count=9;
        System.out.println(n1+" "+n2);
        for(i=2; i<count;++i){
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
}




// write a program to print fibonacci series of n terms whrer n is input by user: 1 1 1 2 3 5 8 13 21
// in the fibonacci series a number is the sum of perivous 2 number traht came before it.