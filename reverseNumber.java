import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println(reverse(sc.nextInt()));
        }
    }
    public static int reverse(int a){
        int rev=0;
        while(a>0){
            rev*=10;
            rev+=a%10;
            a=a/10;
            // rev*=10;
        }
        return rev;
    }
}