import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

class val{
    int a,b;
    val(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class chefsinqueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        tests();
        
        // int n=sc.nextInt();
        // int k=sc.nextInt();
        // int mod=1000000007;
     
        // Stack<val> stack=new Stack<>();
        // int fear=1;
        // stack.push(new val(sc.nextInt(),0));
        // int a,b;
        // val v;
        // for(int i=1;i<n;i++){
        //     b=sc.nextInt();
        //     if(stack.size()==0){
        //         stack.push(new val(b,i));
        //     }else{
        //     v=stack.peek();
        //     while(b<v.a){
        //         fear*=(i-v.b+1)%mod;

        //         stack.pop();
        //         if(stack.empty()){
        //             break;
        //         }else{
        //             v=stack.peek();
        //         }
        //     }
        //     stack.push(new val(b,i));
        //     }
        // }

        // System.out.println(fear);

        //I dont know why did it showed wrong answer

        // int ar[]=new int[n];

        // for(int i=0;i<n;i++){
        //     ar[i]=sc.nextInt();
        // }
        // int fear=1;
        // int min=ar[n-1];
        // for(int i=n-2;i>=0;i--){
        //     if(min<ar[i]){
        //         for(int j=i+1;j<n;j++){
        //             if(ar[i]>ar[j]){
        //                 fear*=(j-i+1)%mod;
        //                 break;
        //             }
        //         }
        //     }else{
        //         min=ar[i];
        //     }

        // }

        // System.out.println(fear);
        
    }    

    public static void tests(){
        Scanner sc=new Scanner(System.in);
        char ch='y';
        int max=6;
        int min=1;
        int n,k;
        while(ch=='y'){
            n=sc.nextInt();
            k=sc.nextInt();
            int ar[]=new int[n]; 
            System.out.println(n+" "+k);
            for(int i=0;i<n;i++){
                ar[i]= (int)(Math.random() * (k - min + 1) + min);
                System.out.print(ar[i]+" ");
            }
            System.out.println();
            feary(n,k,ar);
            ch=sc.next().charAt(0);
        }
    }
    public static void feary(int n,int k,int ar[]){
        int mod=1000000007;
        Stack<val> stack=new Stack<>();
        int fear=1;
        stack.push(new val(ar[0],0));
        int a,b;
        val v;
        for(int i=1;i<n;i++){
            // b=sc.nextInt();
            b=ar[i];
            if(stack.size()==0){
                stack.push(new val(b,i));
            }else{
            v=stack.peek();
            while(b<v.a){
                fear*=(i-v.b+1)%mod;

                stack.pop();
                if(stack.empty()){
                    break;
                }else{
                    v=stack.peek();
                }
            }
            stack.push(new val(b,i));
            }
        }

        System.out.println(fear);
    }
    
}