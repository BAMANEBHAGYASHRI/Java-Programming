public class recursion8_TOH {
    public static void TowerofHonai(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+ n +"from" + src + "to" + dest );
            return;
        }
        TowerofHonai(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + "from" + src + "to" + dest );

        TowerofHonai(n-1, helper, src, dest);

    }
   public static void main(String[] args) {
    int n=3;
    TowerofHonai(n, "S", "H", "D");

   } 
}
//tower of honai