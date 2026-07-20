import java.util.*;

public class function{
  public static  int calculateProduct(int a , int b){
    int product= a*b;
    System.out.println(" product is :"  + product );
    return product;
 }    
 public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b= sc.nextInt();
    calculateProduct(a,b);
 }
}
 

/* 
public class function{
    public static boolean prime(int a ){
        for(int i=2;i<=a-1;i++){
            if(a%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(prime(5));
    }
} */


/* 
            public class function{
                public static boolean Isprime (int n){
                    if(n==1){
                        return false;
                    }
                    if(n==2){
                        return true;
                    }
                    for(int i =2;i<=Math.sqrt(n);i++){
                        if(n%i==0){
                            return false;
                        }
                        
                    }return true;
                }
                public static void main(String[] args) {
                    System.out.print("Prime numbers from 1 to 20 are ");
                    for (int i =1;i<=20;i++){
                    if( Isprime(i))
                    System.out.print(i  + " ");
                }
            }
            }
            */