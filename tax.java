import java.util.*;
public class tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long income= sc.nextLong();
        float tax= 0.0f;
         float taxValue= income* tax;
        if (income < 500000)
        {
            tax=0.0f;
    
        }
        else if (income > 500000 && income < 1000000)
        tax= 0.2f;
        else if( income > 1000000)
        tax=.3f;
    
       double FinalIncome = income - (tax*income);
       System.out.println("salary before tax is = " + income );
       System.out.println("tax given is " + taxValue);
       System.out.println("salary after tax is = " + FinalIncome);



}
}