import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


class wormholes {
   static class pair{
       int st,en;
       public pair(int a,int b){
           st=a;
           en=b;
       }
   }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    // PriorityQueue<Integer> pq=new PriorityQueue<>();
    pair[] con=new pair[n];
    int v1,v2;
    for(int i=0;i<n;i++){
        v1=sc.nextInt();
        v2=sc.nextInt();
        con[i]=new pair(v1,v2);
        // pq.add(v2-v1);
    }
    int[] v=new int[x];
    for(int i=0;i<x;i++){
        v[i]=sc.nextInt();
    }

    int[] w=new int[y];
    for(int i=0;i<y;i++){
        w[i]=sc.nextInt();
    }

    Arrays.sort(v);
    Arrays.sort(w);
    int min=Integer.MAX_VALUE;
    int temp;
    for(int i=0;i<n;i++){
        int start=con[i].st;
        int end=con[i].en;
        // System.out.println(start+" "+end);
        int be=v[0];
        int la=w[y-1];
        if(v[0]>start){
            continue;
        }
        // int j=y-1,
        int k=y-1;
        // // be=left(start,v);
        // // System.out.println(be);
        // while(j>=0){
        //     // be=Math.max(be,v[j]);
        //     if(v[j]<=be){
        //         be=v[j];
        //         break;
        //     }
        //     j--;
        // }
        be=Arrays.binarySearch(v, start);
        if(be<0){
            be=Math.abs(be)-2;
        }
        be=v[be];
        // System.out.println(w[y-1]+" "+end);
        
        if(w[y-1]<end){
            continue;
        }
        // while(k>=0&&w[k]>=end){
        //     la=Math.min(la,w[k]);
        //     k--;
        // }
        // la=right(la,w);
        la=Arrays.binarySearch(w, end);
        // System.out.println(la);
        if(la<0){
            la=Math.abs(la)-1;
        }
        la=w[la];
        temp=la-be+1;
        // System.out.println(temp);
        min=Math.min(min,temp);
        // System.out.println(min+" "+temp);
        // if(min<=pq.peek()){
        //     break;
        // }else{
        //     pq.remove(end-start);
        // }
    }
    System.out.println(min);
   }

}