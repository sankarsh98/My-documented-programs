import java.util.Scanner;

class stfood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();

            int a,b,c,max=0;
            for(int i=0;i<n;i++){
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                int tt=(b/(a+1))*c;
                if(max<tt){
                    max=tt;
                }
            }
            System.out.println(max);
        }
        
    }    
}