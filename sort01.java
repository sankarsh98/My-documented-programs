public class sort01{
    public static void main(String[] args){
        int ar[]={1,0,0,1,0,1,1,0,1};
        int left=0;
        int right=ar.length-1;

        while(left<right){
            //moving 1's to the right pointer and decreasing the right if left is 1
            if(ar[left]==1){
                swap(ar,left,right);
                right--;
            }else{
                left++;
            }
        }
        System.out.println(ar.length);
        for (int a:ar)
        System.out.print(a+" ");
    }
    public static void swap(int ar[],int l,int r){
        int c=ar[l];
        ar[l]=ar[r];
        ar[r]=c;
    }
}