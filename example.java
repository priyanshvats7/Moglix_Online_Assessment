import java.util.*;
public class example {
    public static void Repeat(String str){
        HashMap<Character, Integer> set = new HashMap<>();
        for(int i= 0;i<str.length();i++){
            char num= str.charAt(i);
            if(!set.containsKey(num)){
                set.put(num,1);
                
                }
                else{
                    break;
                }
            }
           
         System.out.print(set.size());
        }
    
    public static void main(String[] args) {
        String str= "abcabcbb";
        Repeat(str);
          
    }
}
 