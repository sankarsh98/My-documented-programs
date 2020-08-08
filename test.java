import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        // while(ch=='y'){
            int k=sc.nextInt();
            int ar[]=new int[k];
            for(int i=0;i<k;i++){
                ar[i]=(int)(Math.random()* (k + 1) + 1);
            }
            Arrays.sort(ar);
            int[] ap={1,3,5,7,9,11};
            for(int i:ar){
                System.out.print(i+" ");
            }
            System.out.println();
            while(ch=='y'){ 
                int m=(int)(Math.random()* (k) + 1);
                System.out.println(m+" "+right(m,ar));
                ch=sc.next().charAt(0);
            }
        // }
        // while(ch=='y'){
            
        // }
    }

    public static int left(int value,int a[]){

        if(value < a[0]) {
            return a[0];
        }
        if(value > a[a.length-1]) {
            return a[a.length-1];
        }

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;

            if (value < a[mid]) {
                hi = mid - 1;
            } else if (value > a[mid]) {
                lo = mid + 1; 
            } else {
                return a[mid];
            }
        }
        // lo == hi + 1
        int aa=Math.abs(a[lo]-value);
        int b=Math.abs(value-a[hi]);
        if(aa==b){
            return Math.min(a[lo],a[hi]);
        }
        return (a[lo] - value) < (value - a[hi]) ? a[lo] : a[hi];
    }
        // int lo = 0;
        // int hi = a.length - 1;
        // int prlo=lo;
        // int prhi=hi;
        // while (lo <= hi) {
        //     int mid = (hi + lo) / 2;

        //     if (value < a[mid]) {
        //         prhi=hi;
        //         hi = mid - 1;
        //     } else if (value > a[mid]) {
        //         prlo=lo;
        //         lo = mid + 1;
        //     } else {
        //         return a[mid];
        //     }
        // }
        // if(lo<0){
        //     return a[prlo];
        // }else if(hi>a.length-1){
        //     return a[prhi];
        // }else{
        //     return a[lo];
        // }
        // // int ar[]={a[lo],a[hi],a[prlo],a[prhi]};
        // // Arrays.sort(ar);
        // // for(int i=3;i>=0;i--){
        // //     if(ar[i]<value){
        // //         return ar[i];
        // //     }
        // // }
        // // return 1;
   

   public static int right(int target,int ages[]){

        return Arrays.binarySearch( ages,target);
        // if (ages == null || ages.length == 0) {
        //     return 0;
        // }
        // int l = 0;
        // int r = ages.length - 1;
        // if (target < ages[0]) {
        //     return -1;
        // }
        // if (target >= ages[r]) {
        //     return r;
        // }
        // while (l  <  r - 1) {
        //     int m = l + (r - l ) / 2 ;
        //     if (ages[m] <= target) {
        //         l = m;
        //     }else {
        //         r = m - 1;
        //     }
        // }
        // return ages[l];// <= target ? r : l;
    
    // if(value < a[0]) {
    //     return a[0];
    // }
    // if(value > a[a.length-1]) {
    //     return a[a.length-1];
    // }

    // int lo = 0;
    // int hi = a.length - 1;

    // while (lo <= hi) {
    //     int mid = (hi + lo) / 2;

    //     if (value < a[mid]) {
    //         hi = mid - 1;
    //     } else if (value > a[mid]) {
    //         lo = mid + 1;
    //     } else {
    //         return a[mid];
    //     }
    // }
    // // lo == hi + 1
    // int aa=Math.abs(a[lo]-value);
    // int b=Math.abs(value-a[hi]);
    // if(aa==b){
    //     return Math.max(a[lo],a[hi]);
    // }
    // return (a[hi] - value) < (value - a[lo]) ? a[lo] : a[hi];
}
}