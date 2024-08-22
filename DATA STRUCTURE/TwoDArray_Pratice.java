import java.util.*;
public class TwoDArray_Pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [] [] matrix = new int[row][col];

        //input
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int x= sc.nextInt();
        //output
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
              if(matrix[i][j]==x){
                System.out.println("x found in matrix("+ i + " ,"+j+")");
              }
            }
        }
        System.out.println();
        
    }
}
//take a matrix as input from the user and serach for a fiven number x and print the indices at which it occurs.