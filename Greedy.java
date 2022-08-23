import java.util.*;
public class Main {
	public static void greedy(int coins,int arr[],int sum) {
		int count = 0;
        LinkedList<Integer> result=new LinkedList<>();
        for(int i = coins-1; i >= 0; i--){
        while(sum >= arr[i]){
            sum -= arr[i];
            result.add(arr[i]);
            count++;
        }
        if(sum == 0)
            break;
    }
    System.out.println(result);
    System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int coins = in.nextInt();
        int arr[]=new int[coins];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int sum=in.nextInt();
        greedy(coins,arr,sum);
	}
}
