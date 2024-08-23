public class StringBuilders {
   public static void main(String[] args) {
    //Declaration
    StringBuilder sb = new StringBuilder("shruti");
    System.out.println(sb);


    //Get A Character from Index
    System.out.println(sb.charAt(3));

    //Insert a Character at Some Index
    sb.insert(6, 'e');
    System.out.println(sb);


    //Delete char at some Index
   sb.delete(6, 'e');
   System.out.println(sb);


   //Append a char - Append means to add something at the end.
   sb.append("bamane");
   System.out.println(sb);


   //Print Length of String
    System.out.println(sb.length());






   } 

   
}
