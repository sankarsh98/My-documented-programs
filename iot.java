import java.util.Scanner;

public class iot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in;
        in=sc.nextInt();
        while(in!=42){
            System.out.println(in);
            in=sc.nextInt();
        }
    }
    
}