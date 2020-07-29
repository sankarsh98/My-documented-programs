import java.util.Scanner;
import java.util.Stack;

class matchedbrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int ni=0;
        int nd=0;
        int li=0;
        int ld=0;

        Stack<Integer> st=new Stack<>();
        int count=0;
        for(int i=0;i<n;i++){
            int in=sc.nextInt();
            if(in==1){
                st.push(1);
                int len=st.size();
                if(nd<len){
                    ni=i+1;
                    nd=len;
                }
            }else{
                st.pop();
                count+=2;
                if(st.empty()){
                    if(count>ld){
                        ld=count;
                        li=i-count+2;
                    }
                    count=0;
                }
            }
        }
        System.out.println(nd+" "+ni+" "+ld+" "+li);
    }    
}