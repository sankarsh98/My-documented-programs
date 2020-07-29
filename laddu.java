import java.util.Scanner;

class laddu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            String o=sc.next();
            // System.out.println(o);
            int l=0;
            for(int i=0;i<a;i++){
                String ac=sc.next();
                // System.out.println(ac);
               switch(ac){
                    case "CONTEST_WON": int r=sc.nextInt();
                                        if(r>20) l+=300;
                                        else l+=(300+20-r);
                                        break;

                    case "TOP_CONTRIBUTOR":
                                        l+=300;
                                        break;
                    case "BUG_FOUND":       
                                        int sev=sc.nextInt();
                                        l+=sev;
                                        break;
                    case "CONTEST_HOSTED":  
                                        l+=50; break;

                    default:
                        break;

                }
            }

            if(o.equals("INDIAN")){
                System.out.println(l/200);
            }else{
                System.out.println(l/400);
            }
        }
    }    
}