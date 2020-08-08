import java.util.Arrays;
import java.util.Scanner;

class rectangle {
    static class Point implements Comparable<Point>{
        int x,y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x>o.x){
                return 1;
            }else if(this.x<o.x){
                return -1;
            }else{
                if(this.y>o.y){
                    return 1;
                }else if(this.y<o.y){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Point[] p=new Point[n+2];
        p[0]=new Point(0,0);
        int a,b;
        for(int i=1;i<=n;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            p[i]=new Point(a,b);
        }
        p[n+1]=new Point(100000,500);
        Arrays.sort(p);

        int max_area=0,temp;
        int ax,ay,min,minx,pm;
        for(int i=0;i<=n;i++){
            min=501;
            minx=0;
            ax=p[i].x;
            ay=p[i].y;
            pm=min;
            for(int j=i+1;j<=n+1;j++){
                if(minx!=p[j].x)
                    pm=min;
                if(min==501){
                    min=Math.min(min,p[j].y);
                    temp=500*(p[j].x-ax);
                }else{
                    if(minx==p[j].x){
                        temp=pm*(p[j].x-ax);
                    }else{
                        temp=min*(p[j].x-ax);
                    }
                    min=Math.min(min,p[j].y);
                }
                minx=p[j].x;
                max_area=Math.max(temp,max_area);
            }
        }

        System.out.println(max_area);
        
    }    
}