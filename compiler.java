import java.util.Scanner;
import java.util.Stack;

class compiler{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            String s=sc.next();
            int max=0;
            int temp=0;
            int count=0;
            int lc,rc;
            lc=rc=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='<'){
                    lc++;
                }else{
                    rc++;
                }
                if(lc==rc){
                    count=i+1;
                }
                if(rc>lc){
                    break;
                }
            }

            // Stack<Character> stack=new Stack<>();

            // for(int i=0;i<s.length();i++){
            //     char ch=s.charAt(i);

            //     if(ch=='>'){
            //         if(!stack.empty()){
            //             stack.pop();
            //             count++;
            //         }else{
            //             break;
            //         }
            //     }else{
            //         stack.push('<');
            //         count++;
            //     }
                // if(stack.empty()){
                //     if(!(((i+1)<s.length())&&s.charAt(i+1)!='>'))
                //     max=max>count?max:count;
                //     count=0;
                // }
            //}

            System.out.println(count);
            // for(int i=0;i<s.length();i++){
            //     if(s.charAt(i)=='<'){
            //         count++;
            //     }else{
            //         count--;
            //     }
            //     if(count<0){
            //         break;
            //     }
            //     if(count>=0){
            //         if(count==0){
            //             if(s.charAt(i)=='>'){
            //                 temp++;
            //             }
            //             max=max>temp?max:temp;
            //         }
            //         temp++;
            //     }else{
            //         temp=0;
            //     }
            // }
            // System.out.println(max);
        }
    }
}