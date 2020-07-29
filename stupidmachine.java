import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class stupidmachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] cap=new int[n];
            int[] items=new int[n];
            for(int i=0;i<n;i++){
                cap[i]=sc.nextInt();
                items[i]=0;
            }
            long total=cap[0];
            for(int i=1;i<n;i++){
                cap[i]=(cap[i]<cap[i-1])?cap[i]:cap[i-1];
                total+=cap[i];
            }
            System.out.println(total);

            //Inefficient Solution

            // for(int i=n-1;i>=0;i--){
            //     int min=Integer.MAX_VALUE;
            //     int minIndex=0;
            //     for(int j=i;j>=0;j--){
            //         if(min>cap[j]){
            //             min=cap[j];
            //             minIndex=j;
            //         }
            //     }
            //     int ca=cap[minIndex];
            //     for(int k=0;k<=i;k++){
            //         items[k]+=ca;
            //         cap[k]-=ca;
            //     }   
            // }
            // int total=0;
            // for(int i=0;i<n;i++) total+=items[i];
            // System.out.println(total);
        }
    }    
}