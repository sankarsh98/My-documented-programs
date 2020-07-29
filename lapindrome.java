import java.util.Arrays;
import java.util.Scanner;

class lapindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            System.out.println(lapindrom(sc.nextLine()));
        }
    }    

    public static String lapindrom(String str){
        String str1,str2;
        int len=str.length();
        str1=str.substring(0,len/2);
        if(len%2==0){
            str2=str.substring(len/2,len);
        }else{
            str2=str.substring(len/2+1, len);
        }

        char[] ar=str1.toCharArray();
        Arrays.sort(ar);
        str1=new String(ar);
        ar=str2.toCharArray();
        Arrays.sort(ar);
        str2=new String(ar);
        if(str2.equals(str1)){
            return "YES";
        }else{
            return "NO";
        }
    }
}