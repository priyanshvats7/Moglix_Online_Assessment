import java.util.*;
public class dynamic {
    public static boolean targetSum(int numbers[],int sum,boolean dp[][],int n){
          for(int i=0;i<n+1;i++){
            dp[i][0]= true;
          }
            for(int j=0;j<sum+1;j++){
                 dp[0][j]= false; 
            }
           
            for(int i =1;i<=n;i++){
                for(int j =1;j<sum+1;j++){
                    if(numbers[i-1]<= j){
                        dp[i][j]= dp[i-1][j-numbers[i-1]]  ||  dp[i-1][j];
                    }
                    else{
                        dp[i][j]= dp[i-1][j];
                    }
                }
            }
            return dp[n][sum];
    }
         public static void main(String[] args) {
            int numbers[]= {4,2,1,7,3};
            int sum= 20;
            int n= numbers.length;
            boolean dp[][] = new boolean[n+1][sum+1];
            System.out.print(targetSum(numbers,sum,dp,n));
         }
}
