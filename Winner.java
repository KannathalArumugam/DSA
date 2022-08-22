import java.util.*;
public class Main {
    public static void remove(LinkedList<Character> value,int n){
        int count=1,j=0;
            while(value.size()!=1){
                if(j==value.size()){
                    j=0;
                }
                if(count%4==0 ||count%10==4){
                    value.remove(j);
                    j=j-1;
                }
                count++;
                j+=1;
            }
        System.out.print(value.get(0)); 
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Character> value  = new LinkedList<Character>(); 
        for(int i=0;i<n;i++){
            char result=in.next().charAt(0);
            value.add(result);
        }
        remove(value,n);
    }
}