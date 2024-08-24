import java.util.*;
class BubbleSort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr[i];i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
    }
}
