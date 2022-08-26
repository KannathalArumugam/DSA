import java.util.*;
public class Main {
    public static int topdown(int[] coins, int sum) {
       int[] dp = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);  //Array with max value
        dp[0] = 0;  //First index as 0 
        for (int i = 1; i <= sum; i++) {
           for (int coin: coins) {
              if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) { //The condition is not equal to the array with the max value
                  dp[i] = Math.min(dp[i], 1 +  dp[i - coin]); 
              }
           } 
        } 
        return (dp[sum] == Integer.MAX_VALUE) ? -1 : dp[sum]; 
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int arr[]=new int[number];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int result=in.nextInt(); //Initializing the total amount
        System.out.println(topdown(arr,result));
    }
}