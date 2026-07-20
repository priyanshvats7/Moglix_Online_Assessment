import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print("greatest number is a = " + a );
        
        }
        else if(b>a && b>c)
        {
            System.out.print("greatest number is b = " + b);

        }
        else if ( c>a && c>b)
        {
            System.out.print("greatest number is" + c);

        }
        
    }
    
}
