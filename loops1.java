import java.util.*;
public class loops1  {
    public static void main(String[] args) {

         /*  Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int evensum= 0;
        int oddsum= 0;
        for( int i=1;i<=n;i++){
            if(i%2==0){
                
                evensum= evensum+i;

            }
            else {
                
                oddsum=oddsum+ i;
            }
        }
    
        System.out.println("numbers upto " + n + " " + "and their even digit sum is " + evensum + " " + "and their odd digit sum is " + oddsum);*/
      
    int evensum=0;
    int oddsum=0;
    Scanner sc= new Scanner (System.in);
System.out.println("enter the number of integers");
int integer= sc.nextInt();
System.out.println("value of numbers are");
for( int i=1;i<=integer;i++){
   int check = sc.nextInt();
   if(check%2==0) {
    evensum += check;
 }
 else {
    oddsum += check;
 }
   
}
 System.out.println("sum of even numbers are "+ evensum);
 System.out.println("sum of odd numbers are "+ oddsum);

    }
}



