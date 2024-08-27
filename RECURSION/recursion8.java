package RECURSION;

public class recursion8 {
    public static void reverseStr(String str , int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print( str.charAt(index));
        reverseStr(str, index-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        reverseStr(str,str.length()-1);
        // System.out.println(str.length()-1);
    }
}
//reverse of string ---abcd
