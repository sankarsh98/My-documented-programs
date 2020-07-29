import java.util.Scanner;

class penaltyshootout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int a,b;
            a=0;
            b=0;
            int i;
            int la,lb;
            la=lb=n;
            for(i=0;i<2*n;i++){
                
                if(i%2==0){
                    if(s.charAt(i)=='1'){
                        a++;
                    }
                    la--;
                }else{
                    if(s.charAt(i)=='1'){
                        b++;
                    }
                    lb--;
                }
                if((a>(b+lb))||(b>(a+la))||(a==b&&i==2*n-1)){
                    System.out.println(i+1);
                    break;
                }
            //     if(s.charAt(i)=='1'){
            //         a++;
                    
            //     }
            //     System.out.println(Math.abs(a-b)+" "+(2*n-i)/2);
            //     if(a>(b+(2*n-i)/2)){//Math.abs(a-b)>(2*n-i)/2){
            //         System.out.println(i+1);
            //         break;
            //     }
            //     i++;
            //     if(s.charAt(i)=='1'){
            //         b++;
            //     }
            //     //System.out.println(Math.abs(a-b)+" "+(2*n-i)/2);
            //     if(b>(a+(2*n-i)/2)){//Math.abs(a-b)>(2*n-i)/2){
            //         System.out.println(i+1);
            //         break;
            //     }
            // }
            // // System.out.println(a+" "+b);
            // if(i==2*n){
            //     System.out.println(i);
            // }
            }
        }
    }    
}