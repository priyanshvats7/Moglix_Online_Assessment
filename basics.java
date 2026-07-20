    /* import java.util.*;
class solution {
    public static void productExceptSelf(int[] nums) {
        int ans[]=  new int[nums.length]; 
        for(int i = 0;i<nums.length;i++){
            int product=1;
            for(int j = 0;j<nums.length;j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            ans[i]= product;
        }
        System.out.print(Arrays.toString(ans));
    }
    public static void main(String args[]){
        int nums[]= {1,2,4,6};
        productExceptSelf(nums);
    }
}  */
/* 
import java.util.*;
class basics{
    public static void BubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,6,5,8,7,0,9};
        BubbleSort(arr);
    }
}

*/

/* 

import java.util.*;
class basics{
    public static void SelectionSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int Pos= i;
            for(int j = i+1;j<array.length;j++){
                if(array[Pos]> array[j]){
                    Pos=j;
                }
            
            }
            if(Pos!=i){
                int temp = array[Pos];
                array[Pos]= array[i];
                array[i]= temp;

            }
        }
        System.out.print(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int array[]= {1,4,2,5,3,6,8,45,33,23};
        SelectionSort(array);
        
    }
}
  */


  import java.util.*;
  class basics{
    public static void main(String args[]){
       ArrayList<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6);
      Collections.sort(list);
       System.out.println(list);
       System.out.println(Collections.max(list));

       list.remove(2);
       System.out.println(list);

       list.add(2,4);
       System.out.println(list);

       list.set(1 , 10);
       System.out.println(list);

       System.out.println(list.contains(20));
        int element = list.get(4);
        System.out.println(element);
        int maximum = list.get(0);
        for(int i= 1;i< list.size();i++){
            if(list.get(i)>maximum ){
              maximum= list.get(i);
            }
        }
        System.out.print(maximum);
  }
}