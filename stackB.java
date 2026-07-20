 /*import java.util.ArrayList;
public  class stackB{
    public static class stack{
       static ArrayList<Integer> list = new ArrayList<>();
        public static  boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int val=list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    } 
} */
// using linklist
/* 
import java.util.*;
public class stackB{
    public static String reverse(String str){
        if(str.length()<1){
            System.out.print("string does not exist");
            return str;
        }
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);
        }
        StringBuilder s1= new StringBuilder();
        while(!s.isEmpty()){
            s1.append(s.peek() + " ");
            s.pop();
        }
     return s1.toString();
    }
    public static void main(String[] args) {
        String str="abcd";
       System.out.print(reverse(str));

        
    }
}. */

// valid parenthesis
import java.util.*;
public class stackB{
    public static boolean valid (String str){
        Stack<Character> s = new Stack<>();
        if(str.length()<1){
            return false;
        }
        else {

        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch== '(' || ch== '{' || ch=='['){  // opening bracket
                s.push(ch);
            } else{
            if(s.isEmpty()){
                return false;
            }
            }
            if(s.peek()=='(' && ch== ')' || s.peek()=='{' & ch=='}'|| s.peek()=='[' && ch==']'){
                s.pop();
            }
            }  
            if(s.isEmpty()){
                return true;
            }
            else{
                return false;
            }
            
        }
        }
   
     
        public static void main(String[] args) {
        String str="()";
        System.out.print(valid(str));
       
         } 
    }
