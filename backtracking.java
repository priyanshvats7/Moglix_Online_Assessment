/* 
import java.util.*;
public class backtracking {
    static void Permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
           String NewStr= str.substring(0,i) + str.substring(i+1);
            Permutation(NewStr,ans+ c);
        }
    }
    public static void main(String[] args) {
        String str= new String("abc");
        String ans=new String();
        Permutation(str,ans);
    }
}
 */
/* 
import java.util.*;
public class backtracking{
    public static void PrintSubset( int arr[],int index, int result){
        if(index==arr.length){
            System.out.println(result);
            return;
        }
        if(arr.length==0){
            System.out.println("null");
        }
        PrintSubset(arr, index+1, result=arr[index]);
        PrintSubset(arr, index+1, result);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,4};
        int index;
        int result;
        PrintSubset(arr,0,0);

    }
}
    */

import java.util.*;
public class backtracking{
    public static void MergeSort(int arr[],int si,int ei){
        if (si >= ei) {  // Base case
            return;
        }
        int mid=si + (ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si, mid, ei);
    }
    public static void Merge(int arr[],int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;
            }
            else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++){
            arr[i]= temp[k];
        }
    }
    public static void main(String args[]){
        System.out.println("Enter array length :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println("Enter array elemts");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        } 
    }
