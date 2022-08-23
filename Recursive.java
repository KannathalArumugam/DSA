import java.util.*;
class Main
{
    static int minCoins(int coins[], int numberOfcoins, int sum)
    {
       if (sum == 0) return 0;
       int res = Integer.MAX_VALUE;// Initialize Result
       for (int i=0; i<numberOfcoins; i++)//Initializing coin that are smaller than sum
       {
         if (coins[i] <= sum)
         {
             int sub_result= minCoins(coins, numberOfcoins, sum-coins[i]);
             if (sub_result != Integer.MAX_VALUE && sub_result + 1 < res)//To avoid Overflow
                res = sub_result + 1;
         }
       }
       return res;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
       int coins[] =  new int [4];
       for(int i =0;i<coins.length;i++){
           coins[i]=in.nextInt();
       }
       int numberOfcoins = coins.length;
       int sum = in.nextInt();
       System.out.println("Minimum coins required : "+ minCoins(coins, numberOfcoins, sum) );
    }
}