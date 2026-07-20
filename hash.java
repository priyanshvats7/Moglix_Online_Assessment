import java.util.*;
public class hash{
   /*  public static void Majority(int arr[]){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
             int num= arr[i];
             if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
                
             }
             else{
                map.put(num,1);
             }
                 
                }
                
             }
        }
             */
    public static void Inter(int arr[],int arr1[]){
        HashSet<Integer> set = new HashSet<>();
       
        int counter=0;
        for (int  num : arr) {
            set.add(num);
            
        }
        for(int num : arr1){
            set.add(num);
        }
          List<Integer> l = new ArrayList<>(set);
          Collections.sort(l);
          System.out.println(" the union of two array is = " + l.size());
          System.out.println(l);


         set.clear();
         for(int num : arr1){
            set.add(num);
         }
         List<Integer> union = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            int num= arr[i];
            if(set.contains(num)){
                counter++;
                union.add(num);
                set.remove(num);
            }
            
         }
         Collections.sort(union);
         
          
          System.out.println(" the union of two array is = " + union.size());
          System.out.println(union);

              }
                public static void main(String[] args) {
       int arr[]= {7,3,9,3};
       int arr1[]={6,3,9,2,9,4};
       Inter(arr,arr1);
    }
         }
    
    

