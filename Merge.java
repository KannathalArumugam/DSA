import java.util.*;
public class Main {
    public static void mergesort(int arr[]){
        int length = arr.length;
        if(length <= 1)
            return;
        
        //to find the middle position of array
        int middle = length / 2;
        int left[] = new int[middle];
        int right[] = new int[length-middle];

        //copy the elements of original array to left and right array
        int i=0;//left array
        int j=0;//right array

        //copying left array
        for(;i<length;i++){
            if(i<middle){
                left[i]=arr[i];
            }else{ //copying right array
                right[j]=arr[i];
                j++;
            }
        }
        mergesort(left);
        mergesort(right);
        merge(left,right,arr);
    }
    public static void merge(int left[],int right[],int arr[]){ 
        int leftsize=arr.length/2;
        int rightsize=arr.length-leftsize;
        int i=0,r=0,l=0;
        while(l<leftsize && r<rightsize){
            if(left[l]<right[r]){//copying left array elements to original array
                arr[i]=left[l];
                i++;
                l++;
            }else{//copying right array elements to original array
                arr[i]=right[r];
                i++;
                r++;
            }
        }
        //as there will be one element left over
        while(l<leftsize){
            arr[i]=left[l];
            i++;
            l++;
        }
        while(r<rightsize){
            arr[i]=right[r];
            i++;
            r++;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        mergesort(arr);
        System.out.println("\n"+"Sorted Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 
// moves smaller elements to left of the pivot
//divides the array into 2 partions and pass them recursively
