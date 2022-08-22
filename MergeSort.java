import java.util.*;
public class Main
{
public static void conquer(int a[],int low,int mid,int high){
   int mergesort[]=new int[high-low+1];
   int i1=low;
   int i2=mid+1;
   int k=0;
   while(i1<=mid && i2<=high){
       if(a[i1]<=a[i2]){
           mergesort[k]=a[i1];
           k++;
           i1++;
       }
       else{
           mergesort[k]=a[i2];
           k++;
           i2++;
       }
   }
   while(i1<=mid){
       mergesort[k]=a[i1];
       k++;
       i1++;
   }
   while(i2<=high){
       mergesort[k]=a[i2];
       k++;
       i2++;
   }
   int i,j;
   for(i=0,j=low;i<mergesort.length;i++,j++){
       a[j]=mergesort[i];
   }
}
public static void divide(int a[],int low,int high){
   if(low>=high){
       return;
   }
   int mid=(low+high)/2;
   divide(a,low,mid);
   divide(a,mid+1,high);
   conquer(a,low,mid,high);
}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
     int n = in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
   divide(a,0,n-1);
   System.out.print("Sorted Array : ");
   for( int i=0;i<n;i++){
       
       System.out.print(a[i]+" " );
   }
   System.out.println();
}
}