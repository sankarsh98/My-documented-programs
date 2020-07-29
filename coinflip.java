import java.util.Scanner;

class coinflip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int g=sc.nextInt();
            for(int i=0;i<g;i++){
                int is,n,q;
                is=sc.nextInt();
                n=sc.nextInt();
                q=sc.nextInt();

                if(n%2==0){
                    System.out.println(n/2);
                }else{
                    if(q==is){
                        System.out.println(n/2);
                    }else{
                        System.out.println(n/2+1);
                    }
                }
            }
        }
    }    
}