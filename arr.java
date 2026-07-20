// LINEAR SEARCH
 /*import java.util .*;
public class arrays {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
                     int marks[]= {2,4,6,8,10,12,14} ;
                     int key= sc.nextInt();
                     for(int i =0; i< marks.length;i++){
                        if(marks[i]!= key){
                            continue;
                        
                        }
                        else 
                        {
                            System.out.print(" key is found at =" + i);
                            break;
                            
                        }
                     }
                     
    }
    
}
    */

 // LINEAR SEARCH //    
    /* 
    import java.util.*;

public class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {2, 4, 6, 8, 10, 12, 14};
        int key = sc.nextInt();
int i;
        for (i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                System.out.println("Key is found at index = " + i);
                break;
            }
        }

        // If loop completed fully and key not found
        if ( i == marks.length) {
            System.out.println("Key not found in the array.");
        }

        sc.close();
    }
}
*/
// LINEAR SEARCH //
/* 
import java.util.*;
public class arrays{
    public static int LinearSearch(int num[] ,int key){
        for(int i=0; i<num.length;i++){
            if(num[i]== key){
                return i;
            }
        }
                  return -1 ;
    }
    public static void main(String args[]){
        int num[]= {2,4,6,8,10,12,14};
        int key = 10;
        int index= LinearSearch  (num,key);
        if(index==-1)
        {
            System.out.print(" key not found");
        }
        else{
            System.out.print("key found at" + index);
        }
        
    }
}
    */
/* 
    import java.util.*;
    public class arrays{
        public static int CheckLargest(int num[]){
            int max= num[0] ;
            for(int i=1;i<num.length;i++){
                if(num[i]>=max){
                    max= num[i];
                }
               
        }
        return max;
    }

        public static void main(String[] args) {
            int num[]= {6,5,6,9,5};
            System.out.print(   CheckLargest(num) + " ");
        }

    }

    */
/* 
// LINEAR SEARCH // 
    import java.util.*;
    public class arrays{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numbers[]= {2,4,6,8,10,12,14,16,18,20};
            int key = sc.nextInt();
            int index = -1;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==key){
                    index = i;
                    break;
                }
            }
            if(index== -1)
            System.out.print("key not found");
            else
            System.out.print("key found at " + index);
        }
    }
        */

/* 
// LARGEST NUMBER IN ARRAY //
        import java.util.*;
        public class arrays{
            public static int Largest(int numbers[]){
                int larg=1;
                for(int i=0;i<numbers.length;i++){
                    if(larg<=numbers[i]){
                     larg = numbers[i];
                    }
                    
                }
                return larg;
            
            }
            public static void main(String[] args) {
                int numbers[]= {1,2,6,3,5};
                System.out.print(Largest(numbers));
            }
        }
*/

// BINARY SEARCH //
/* 
    public static int Binary_Search(int num[],int key){
     int start= 0; 
     int end= num.length -1;
     while(start<=end){
        int mid=  (start + end)/2;
        if(num[mid]== key){
            return mid ;
        }
         if (num[mid]>key){
            end= mid-1;
        }
         if (num[mid]<key){
            start = mid +1;
        }
        }
        return -1;
    }
        
    

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]= {5,10,15,20,25,30,35};
        int key= sc.nextInt();
        System.out.print(" key is at index " +  Binary_Search(num, key));
        }
    
*/
/* 

   // REVERSE ARRAY //
import java.util.*;
        public class arr{
            public static void Reverse(int numbers[]){
                System.out.print(" Array after reversing is " );
                for(int i= numbers.length-1;i>=0;i--)
                System.out.print( numbers[i] + " ");
            }
            public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int numbers[]= new int[10];
                System.out.println("enter 10 numbers");
                for(int i=0;i<numbers.length;i++){
                    numbers[i]= sc.nextInt();
                }
                System.out.print("Array before reversing is ");
                for( int i=0;i<numbers.length;i++){
                    System.out.print(numbers[i]+ " ");
                }
                System.out.println();
                Reverse(numbers);
                
            }
        }

        */

/* 
        // PAIRS IN ARRAY //
                
        import java.util.*;
        public class arr{
            public static void Pair_Array(int arr[]){
                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        System.out.print("(" + arr[i]+ "," + arr[j]+ ") ");
                        

                    }
                    System.out.println();
                }
                
            }
            public static void main(String[] args) {
                int arr[] = new int[5];
                Scanner sc = new Scanner(System.in);
                for(int i=0;i<arr.length;i++){
                    arr[i]= sc.nextInt();
                }
                Pair_Array(arr) ;
            }

        }


        */
/* 
 // PRINT SUBARRAYS //
 import java.util.*;
 public class arr{
    public static void PrintSubarray(int Array[]){
        for(int i= 0; i<number.length;i++){
            
        }
    }
    public static void main(String[] args) {
        int Array[] = new int[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER ARRAY NUMBERS :");
        for(int i=0;i<Array.length;i++){
            Array[i]= sc.nextInt();
        }
    }
 }       
    */
/* 
    import java.util.*;
    public class arr{
        public static void Subarrays(int numbers){
            for(int i= 0;i<numbers.length;i++){
                System.out.println(numbers[i]);
                for(int j=i+1;j<numbers.length;j++){
                    System.out.print()
                    
                }
            }
        }
        public static void main(String[] args) {
            int numbers = { 2,4,6,8,10};

        }
    }
    *//* 
import java.util.*;
    public class arr{
        public static void Subarrays(int numbers[]){
            int currentSum=0;
            int maxSum=Integer.MIN_VALUE;
            for(int i= 0;i<numbers.length;i++){
                int start= i;
                     for(int j=i;j<numbers.length;j++){
                      int end= j;
                      currentSum=0;
                         for(int k= start;k<=end;k++){
                            currentSum +=numbers[k];

                       }
                          System.out.println(currentSum);
                          if(currentSum>=maxSum){
                            maxSum=currentSum;
                          }
                   }
                   System.out.println();
            }
            System.out.println(" maximum subaaray sum is" + maxSum);
        
        }
        public static void main(String[] args) {
            int numbers[] = { 2,4,6,8,10};
            Subarrays(numbers);
        }
    }
    */ /* 
    import java.util.*;
    public class arr{
        public static boolean Search(int arr[][],int n, int m ,int key){
            boolean found = false;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]== key){
                        found= true;
                        
                    }
                }
           } 
           System.out.print(" key not found ");
           return false;
        }
         public static void main(String args[]){
            System.out.println(" enter the matrix size n*m");
            int key= 12;
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            int m= sc.nextInt();
            System.out.println(" enter the elements of matrix");
            int arr[][] = new int [n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]= sc.nextInt();
                }
                System.out.println();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print(Search(arr,n,m,key));
         } 
      }
*/

/* 
import java.util.*;
public class arr{
       public static int printspiral(int arr[][]){
        int sum=0;
        for(int i=0; i<=arr.length-1;i++){
            for (int j=0;j<=arr[0].length-1;j++){
                if(i==j){
                    sum += arr[i][j];
                    
                }
                else if(i+j==arr.length-1){
                    sum+= arr[i][j];
                }
            }
        }
        
        System.out.print(" the sum of the diagonals is :" + sum );
        return sum;

       }
       public static void main(String[] args) {
        int arr[][]= {{1,2,3,4}, 
        {5,6,7,8},  
        {9,10,11,12}, 
        {13,14,15,16}
       };
       printspiral(arr);
}
}
        */
        /* 
import java.util.*;
public class arr{
    public static void Trada(char arr[][]){
        int temp=0;
         for(int i=0;i<=arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                temp=i;
                i=j;
                j=temp;
                System.out.print(arr[i][j] );


            }
         }

            }
            public static void main(String args[]){
                    char arr[][]= { { 'a','b','c'}, {'d','e','f'}};
                    System.out.print("before transpose order is " + arr.length + "," +  arr[0].length);
                    System.out.println("after transpose order is" + arr[0].length + "," + arr.length);
                   Trada(arr);
            }

        } */

/* 
import java.util.*;
public class arr{
    public static int isprime( int n){
        int isprime1= 1; 
          if(n<=1){
            isprime1= -1;
          
          }
          int limit= (int)(Math.sqrt(n));
        for(int i=2;i<=limit;i++){
            if(n%i==0){
                isprime1=-1;
                break;
            }
        }
        if(isprime1==1){
            System.out.println("number is prime");
        }
        else{
            System.out.println(" number is composite");
        }
       return isprime1;
    }
    
      public static void main(String[] args) {
       System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       isprime(n);
       
      }
}

*//* 
import java.util.*;
public class arr{
        public static void index( String s){
            for(int i=0; i<s.length();i++){
                System.out.print(s.charAt(i) +" " );
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String s= sc.nextLine();
        System.out.println(" length of the string is " + s.length());
        index(s);

    }
}

*/

/* 

   import java.util.*;
   public class arr{

        public static String Check(String s1,String s2,String s3){
                 if (s1.length()>s2.length() && s1.length()>s3.length()){
                    System.out.print("String s1 is the largest");
                    return s1;
                    
                 }
                  else if (s2.length()>s3.length() && s2.length()>s1.length()){
                    System.out.print("String s2 is the largest");
                    return s2;
                  }
                  else{
                    System.out.print("String s3 is the largest");
                    return s3;
                  }
                  
        }

     public static void main(String[] args) {
        String s1="apple";
        String s2="mango";
        String s3= "banana";
        Check(s1,s2,s3);
     }
   }

*/
                
/* 
             import java.util.*;
             public class arr{
  
              public static String Print (String str){ 
                StringBuilder sb= new StringBuilder("");
                
                for(int i=0;i<str.length();i++){
                    int counter=1;
                    while(i< str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                        counter++;
                        i++;
                    }
                    sb.append(str.charAt(i));
                    if(counter>1){
                        sb.append(counter);
                    
                        }
                    }
                    System.out.print("after compressing the string is " + sb.toString());
                    return sb.toString();
                }
                public static void main(String[] args) {
                    String str= "abcdd";
                    System.out.println("before compressing the string is " + str);
                    Print(str);
                }
             }


             */


     /*         import java.util.*;

import javax.print.attribute.standard.Compression;
             public class arr{
                public static void Convert(String str){
                    StringBuilder sb= new StringBuilder();
                    for(int i=0;i<str.length();i++){
                        if(i==0){
                            sb.append(Character.toUpperCase(str.charAt(i)));
                        }
                        else if (i < str.length() - 1 && str.charAt(i) == ' ') {
                            sb.append(str.charAt(i));
                            sb.append(Character.toUpperCase(str.charAt(i+1)));
                            i++;
                        }
                        else{
                        sb.append(str.charAt(i));
                    }
                    }
                    System.out.print(sb.toString());
                }

      public static void Compression(String str){
                     
                        StringBuilder sb = new StringBuilder();
                        if(str.length()<1){
                            System.out.print(" null string ");
                            return ;
                        }
                          
                        for(int i = 0;i < str.length();i++){
                            int counter=1;
                            while( i< str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                                counter ++;
                                i++;
                            }
                            if(counter>1){
                                sb.append(str.charAt(i) );
                                sb.append(counter);
                            }
                            else{
                                sb.append(str.charAt(i));
                            }

                        }
                 System.out.print(sb.toString());
     }


                public static void main(String[] args) {
                    String str = "aaa1113443b54bbccddserf";
                    Compression(str);

                }
             } 
            
*/
/* 

import java.util.*;
public class arr{
    public static void CheckAnagrams(String str, String str1){
        StringBuilder sb = new StringBuilder();
        char ch[]= str1.toCharArray();
        if(str.length()==str1.length()){
            for(int i =0; i< str.length();i++){
                for(int j= 0;j<str1.length();j++){
                    if(str.charAt(i)== ch[j]){
                         sb.append(str.charAt(i));
                         ch[j]='#'; 
                           
                    }
                }
            }
            if(sb.toString().compareTo(str)==0){
                System.out.print("anagrams");
                return;
            }
            else{
                System.out.print(" not an anagrams");
                return;
                
            }
        }
        System.out.print("Not an Anangram ");
    }
    public static void main (String args[]){
        String str= new String();
        String str1 = new String();
        CheckAnagrams("heelo","elohc");
    }
}

*/

/* 

import java.util.*;
public class arr{
    public static void Adder( String s1 , String s2 ){
        StringBuilder s3 = new StringBuilder();
        if(s1.length()!= s2.length()){
            System.out.println(" strings are not equal");
            return;
        }
        else{
             for(int i=0; i<s1.length();i++){
                        s3.append(s1.charAt(i));
                        s3.append(s2.charAt(i));       
             }
            String result=  s3.toString(); 
             System.out.println(result);
             
            }

    }





    public static void main(String[] args) {
        String s1="dd"; 
        String s2="ec";
        String s3="acbd"; //
        Adder(s1, s2);
    }
} 


*/


/* 

import java.util.*;
public class arr{
    public static void Majority(int nums[]){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int digit= nums[i];
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
            Set<Integer> s= map.keySet();
            for(int k : s){
                if(map.get(k)> nums.length/3.0f){
                    System.out.print(k + " ");

                }
            }

            } 
    public static void main(String[] args) {
        int nums[]= {1,2};
        Majority(nums);
    }
}


*/

/* 
import java.util.*;
public class arr{
    public static String getStart(HashMap <String, String> map){
           HashMap< String , String > revmap = new HashMap<>();
           for(String num : map.keySet()){
            revmap.put(map.get(num), num);
           }
           for(String num : map.keySet()){
            if(!revmap.containsKey(num)){
                return num;
            }
           }
        return null;
    }







    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
          String start = getStart(map);
          System.out.print(start);
          for (String keys : map.keySet()){
            System.out.print("->" + map.get(start));
            start = map.get(start);
          }
    }
}


*/

/* 
import java.util.*;
public class arr{
    public static int Largest(int arr[], int target){
        int large=0;
        for(int i=0;i<arr.length;i++){
            int sindices= 0;
            
            for(int j=i;j<arr.length;j++){
                int sum=0;
                 for(int k=i; k<=j;k++){
                     sum += arr[k];
                 }
                 if(sum== target){
                    sindices= (j-i)+1;
                     large= Math.max(large,sindices);
                 }
            }
                
            }
            return large;
        }
   public static void main(String[] args) {
    int arr[]={15,-2,2,-8,1,7,10,23};
    int target=0;
    System.out.print(Largest(arr, target));

   }
}
*/
/* 

import java.util.*;
public class arr{
    public static void Reverse(int arr[]){
        int j= arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i<j){
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
                i++;
                j--;
            }
        }
        System.out.print();

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Reverse(arr);
    }
}
    */
    import java.util.*;
public class arr{
    public static void Reverse(int arr[]){
        int j= arr.length-1;
        int i=0;
        while(i<j){
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
        public static void kadane(int arr[]){
            int cs=0;
            int ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                cs=cs+ arr[i];
                if(cs<0){
                    cs=0;
                }
                ms= Math.max(cs,ms);
            }
            System.out.print("max subarray sum is" + ms);
        }
            public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,-18,20};
        kadane(arr);

    }
}