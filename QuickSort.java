import java.util.*;
class Main{
static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static int partition(int[] arr, int low, int high)
{ int randomindex=(low)+(int)(Math.random()*(high-low+1));
    int temp1=arr[randomindex];
    arr[randomindex]=arr[high];
    arr[high]=temp1;
    int pivot = arr[high]; 
    int i = (low - 1); 
    for(int j = low; j <= high - 1; j++)
    {
        if (arr[j] < pivot) 
        {
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
static void quicksort(int[] arr, int low, int high)
{
    if (low < high) 
    {
        int result = partition(arr, low, high);
        quicksort(arr, low, result - 1);
        quicksort(arr, result + 1, high);
    }
}
static void printArray(int[] arr, int size)
{
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");     
    System.out.println();
}
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
     int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    quicksort(arr, 0, n - 1);
    System.out.println("Sorted Array: ");
    printArray(arr, n);
}
}
