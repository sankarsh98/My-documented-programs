import java.util.Arrays;
import java.util.Scanner;

class smartphone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        Arrays.sort(ar);

        int max=0,m;
        for(int i=0;i<n;i++){
            m=ar[i]*(n-i);
            max=max>m?max:m;
        }

        System.out.println(max);
    }    
}