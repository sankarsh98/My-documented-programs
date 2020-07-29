import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



class carvans {
    public static void main(String[] args) throws Exception{
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=num(br.readLine());
        while(t-->0){
            int n=num(br.readLine());//sc.nextInt();
            StringTokenizer st=new StringTokenizer(br.readLine());
            int f=num(st.nextToken());//sc.nextInt()
            int s;
            int sum=1;
            for(int i=1;i<n;i++){
                s=num(st.nextToken());//sc.nextInt();
                if(s<=f){
                     sum++;
                     f=s;
                }

                
            }
            System.out.println(sum);
        }
    }   
    public static int num(String s){
        return Integer.parseInt(s);
    } 
}