import java.util.Scanner;

class factorials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            // if(num%5!=0){
            //     num-=num%5;
            // }
            int sum=0;
            int res=0;
            int mul=5;
            do{
                res=num/mul;
                sum+=res;
                mul*=5;
            }while(res!=0);
            System.out.println(sum);
        }
    }    
}