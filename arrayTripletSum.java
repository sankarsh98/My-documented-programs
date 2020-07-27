import java.util.Arrays;
import java.util.HashSet;

//Write a Java program or function which finds triplets in the given array whose sum is equal to given number. For example, if [7, 5, 9, 3, 0, 8, 6] is the given array and 12 is the given number then array triplets whose sum is equal to 12 are [7, 5, 0] and [9, 3, 0].
public class arrayTripletSum {
    public static void main(String[] args) {
        int ar[]={7, 5, 9, 3, 0, 8, 6};
        int sum=12;

        bruteForce(ar,sum);
        System.out.println();
        usingHashSet(ar,sum);
        System.out.println();
        usingSorting(ar,sum);

    }


    //this uses sorting and pointers
    private static void usingSorting(int[] ar, int sum) {
        //sort the array
        Arrays.sort(ar);
        
        //outer loop
        for(int i=0;i<ar.length-2;i++){
            //two pointers
            int left=i+1;
            int right=ar.length-1;

            //see all possibilities
            while(left<right){
                int rSum=ar[i]+ar[left]+ar[right];
                //three cases if the rSum is equal, greater or less than the sum
                
                //if rSum is equal to the sum then print the triplet
                if(rSum==sum){
                    System.out.println(ar[i]+" "+ar[left]+" "+ar[right]);
                    //move both pointers towards each other
                    left++;
                    right--;
                }//if rSum is less than sum, increase rSum by moving the left pointer rightside.
                else if(rSum<sum){
                    left++;
                }//if rSum is greater than sum, decrease rSum by moving the right to the leftside.
                else{
                    right--;
                }

            }
        }
    }

    // This method uses two for loops and a hashset for storing the sums of the
    // second for loop
    private static void usingHashSet(int[] ar, int sum) {
        int len=ar.length;
        //outer for loop
        for(int i=0;i<len;i++){
            //set for storing the sums
            HashSet<Integer> hs=new HashSet<>();
            //for keeping the sum in the second loop
            int rSum=0;
            for(int j=i+1;j<len;j++){
                rSum+=ar[j];
                //see if (sum-ar[i]-ar[j]) present in the set then print the triplet
                if(hs.contains(sum-ar[i]-ar[j])){
                    System.out.println(ar[i]+" "+ar[j]+" "+(sum-ar[i]-ar[j]));
                }

                //add the rSum to set
                hs.add(rSum);

            }
        }
    }

    private static void bruteForce(int[] ar, int sum) {
        //consider every possibility
        int len=ar.length;
        int i,j,k;
        for(i=0;i<len-2;i++){
            for(j=i+1;j<len-1;j++){
                for(k=j+1;k<len;k++){
                    if ((ar[i]+ar[j]+ar[k])==sum){
                        System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
                    }
                }
            }
        }

    }

    
}


/*
Input Array : [7, 5, 9, 3, 0, 8, 6]
Given Number : 12
Array triplets whose sum is 12 are :
[7, 0, 5]
[9, 0, 3]
===========================
Input Array : [-3, 7, -1, -5, 2, -9, 1]
Given Number : 0
Array triplets whose sum is 0 are :
[-3, 1, 2]
[7, -9, 2]
===========================
Input Array : [17, 51, 39, 29, 33, 21, 65]
Given Number : 89
Array triplets whose sum is 89 are :
[17, 33, 39]
[17, 21, 51]
[39, 21, 29]


*/