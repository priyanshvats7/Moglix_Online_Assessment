//BUBBLE SORT

/* 
import java.util.*;
class sorting{
    public static void Bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int swap=0;
            for(int j=0; j<arr.length-1-turn;j++ ){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                    swap++;
                }
            }
             System.out.println("After pass " + (turn + 1) + ": " + Arrays.toString(arr));
                
            if(swap==0 ){
                System.out.println("array sorted after this pass" );
                    break;
                }
        }
                        System.out.print("Sorted array is" + Arrays.toString(arr));   
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        Bubble(arr);
    }
}
    */


    //INSERTION 
 import java.util.*;
 class sorting{
    public static void Selection(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        int MinPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[MinPos]> arr[j]){
                MinPos= j;
            }
        }
        if(MinPos!=i){
        int temp = arr[MinPos];
        arr[MinPos]= arr[i];
        arr[i]= temp;
        }
       }
    System.out.println(Arrays.toString(arr));
       
}
    public static void main(String[] args) {
        int arr[]= {5,4,3,1,2};
        Selection(arr);
    }
 }



