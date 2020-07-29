import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class multipleofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a;
            int b,c;
            a=sc.nextLong();
            b=sc.nextInt();
            c=sc.nextInt();
            int sum=b+c;
            //int ar[]=new int [10];
            int rep=sum%10;
            LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
            // hm.put(-1,-1);
            int num;
            int i=0;
            hm.put(rep,i++);
            while(true){
                num=(rep*2)%10;
                if(hm.containsKey(num)){
                    break;
                }
                // System.out.print(num+" ");
                hm.put(num,i++);
                rep=num;
            }
            
            int k=hm.get(num);
            // System.out.println("k "+k);
            int ar[]=new int[10];
            i=0;
            int numm=0;
            int reps=0;
            for(Map.Entry<Integer,Integer> ent:hm.entrySet()){
                int ke=ent.getKey();
                int va=ent.getValue();
                // System.out.println(ke+" "+va);
                if(va<k){
                    sum+=ke;
                    numm++;
                }else{
                    ar[i++]=ke;
                    // System.out.println("ar "+j+" "+ar[j-1]);
                    reps+=ke;
                }

            }
            int nu=2+k;
            if(a==2){
            if((b+c)%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }}else{
                long sss=0;
                if(a<=nu){
                    // System.out.println("Inside");
                    sum=b+c;
                    nu-=2;
                    for(Map.Entry<Integer,Integer> ent:hm.entrySet()){
                        int ke=ent.getKey();
                        int va=ent.getValue();
                        if(nu==va){
                            sum+=ke;
                            break;
                        }
                        sum+=ke;
                    }
                }else{
                    a-=numm;
                    a-=2;
                    long kn=a%(long)i;
                    // System.out.println("a "+a);
                    // reps=reps%3;
                    sss=sum;
                    if((a/i)>0){
                        sss+=reps*(a/i);
                    }
                    // System.out.println(i+" "+kn+" "+sum);
                    for(int z=0;z<kn;z++){
                        sss+=ar[z];
                    }
                    
                }
                if((sss)%3==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                // System.out.println(sss);
            }
        }
    }    
}