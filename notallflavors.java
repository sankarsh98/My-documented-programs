import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


class notallflavors {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int max=0;
            int count=0;
            HashSet<Integer> hs=new HashSet<>();
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<n;i++){
                int b=sc.nextInt();
                hs.add(b);
                ar.add(b);
                // System.out.println(hs);
                if(hs.size()==k){
                    while(true){
                        // System.out.println(ar);
                        int rem=ar.get(0);
                        ar.remove(0);
                        if(!ar.contains(rem)){
                            hs.remove(rem);
                            break;
                        }
                    }
                    // count=0;
                }
                    // count++;
                max=max>ar.size()?max:ar.size();
                
            }
            System.out.println(max);
        }
    }    
}