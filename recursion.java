import java.util.*;
public class recursion {
    static String digits[]= {"zero" , "one" , "two", "three", "four", "five" , "six", "seven" , "eight", "nine"};
    public static void Print(int n, int i ){
        if(n==i){
              System.out.print(i );
              return ;
        }
        Print(n,i+1);
        System.out.print(i+ "");
    }
    public static void MeanArray(int arr[], int i, int sum ){
        if(i==arr.length){
            System.out.print(" mean of the array is"+" i" );
        }
        if(i<=arr.length-1){
            MeanArray(arr,i+1,sum+=arr[i]);
            float avg = (float)sum/arr.length;
           
 
        }
         System.out.print("avg of array is" );

    }
    public static void count(String str, int i){
        if(i>str.length()){
            return;
        }
        if(i==str.length()){
            System.out.print(i);
        }
        count(str,i+1);
        
    }
    
    public static void main(String[] args) {
        String str= "HELLO";
        count(str,0);
    }

    }
    

