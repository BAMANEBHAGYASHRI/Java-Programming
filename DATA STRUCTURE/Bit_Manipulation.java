import java.util.*;
public class Bit_Manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        //ope =1 ---set ; op=0 ===clear

        //gitbit
        int num=5;
        int pos=2;
        int bitmask=1<<pos;
        // if((bitmask & num) == 0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }


        //set bit
        // int newn=bitmask | num;
        // System.out.println(newn);

        //clear bit
        // int notbitmask=~(bitmask);
        // int newnumber =notbitmask & num;
        // System.out.println(newnumber);


        //update bit
        if(op==1){
            int newnum=bitmask | num;
            System.out.println(newnum);
        }
        else{
            int newbitmask=~(bitmask);
            int newnum=bitmask & num;
            System.out.println(newnum);
        }



    }
}
