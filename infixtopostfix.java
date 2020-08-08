import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


class infixtopostfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            String post="";
            Stack<Character> stack=new Stack<>();
            HashMap<Character,Integer> op=new HashMap<>();
            op.put('+',0);
            op.put('-',0);
            op.put('*',1);
            op.put('/',1);
            op.put('^',2);
            stack.push('(');
            s=s+")";
            for(int i=0;i<n+1;i++){
                char ch=s.charAt(i);
                // System.out.println(ch);
                if(Character.isLetter(ch)){
                    post+=Character.toString(ch);
                }
                else if(ch=='('){
                    stack.push(ch);
                }
                else if(op.containsKey(ch)){
                    // System.out.println(ch+"\n");
                    while(stack.size()>0&&stack.peek()!='('){
                        // System.out.println(Arrays.toString(stack.toArray()));
                        char opp=stack.peek();
                        if(op.get(ch)<=op.get(opp)){
                            post+=Character.toString(stack.pop());
                        }else{
                            break;
                        }
                    }
                    stack.push(ch);
                }
                else{
                    while(stack.peek()!='('){
                        post+=Character.toString(stack.pop());
                    }
                    stack.pop();
                }
                
            }
            System.out.println(post);
        }
    }    
}