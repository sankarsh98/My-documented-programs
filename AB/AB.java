public class AB {
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=12;
        AB obj=new AB();
        System.out.println(obj.createString(a,b));
    }
    public String createString(int N, int K){
        int mp;
        if(N==2&&K==0){
            return "BA";
        }
        if(N%2==0){
            mp=(N/2)*(N/2);
        }else{
            mp=(N/2)*((N+1)/2);
        }
        if(K>mp){
            return "";
        }
        String str="";
        if(K>=N && isPrime(K)){
            int f=factorize(K+1, N);
            str=makeString(N, f, K+1);
            char prev='B';
            int i;
            for(i=0;i<str.length();i++){
                if(prev=='A'){
                    if(str.charAt(i)=='B'){
                        break;
                    }
                }
                prev=str.charAt(i);
            }
            str=str.substring(0, i-1)+"BA"+str.substring(i+1, N);

        }else{
            int f=factorize(K, N);
            str=makeString(N, f, K);
        }

       


        return str;
    }

    public static int factorize(int K,int N){
        int i;
        for(i=K;i>=1;i--){
            if(K%i==0){
                if(i<N){
                    break;
                }
            }
        }
        return (i>K/i)?i:(K/i); 
    }
    public static String makeString(int n,int m,int k){
        String str="";
        int c=k/m;
        int rem=n-c-m;
        while(c-->0){
            str+="B";
        }
        while(m-->0){
            str="A"+str;
        }
        // int rem=n-c-m;
        // System.out.println(rem);
        while(rem-->0){
            str="B"+str;
        }
        return str;
    }
    public static boolean isPrime(int n) 
    { 
        // Corner cases 
        if (n <= 1) 
            return false; 
        if (n == 3) 
            return true; 
  
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
  
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
  
        return true; 
    } 
}