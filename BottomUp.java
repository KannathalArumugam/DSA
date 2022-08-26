import java.util.*;
public class Main {
    public static int bottomup(int[] coins, int sum) {
        int[] result = new int[sum + 1];
        for (int i = 1; i <= sum; i++) {
            int minCoins = sum + 1;
            for (int coin : coins) {
                int remain = i - coin;
                if (remain < 0) {
                    continue;
                }
                minCoins = Math.min(minCoins, result[remain] + 1);
            }
            result[i] = minCoins;
        }
        return result[sum] == sum+ 1 ? -1 : result[sum];
    }
     public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int arr[]=new int[number];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int sum=in.nextInt();
        System.out.println(bottomup(arr,sum));
    }
}