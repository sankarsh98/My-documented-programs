import java.util.HashMap;

public class contiguousSubArraySum {
   
    public static void main(String[] args) {
        // the array
        int ar[]={5, -9, 4, -2, 7, 1, -4, -3, -7};
        // required sum
        int rsum=-7;

        //Brute force solution
        bruteForce(ar,rsum);
        System.out.println();
        efficientSolution(ar,rsum);

        
    }

    public static void bruteForce(int ar[],int rsum){
        int len=ar.length;
        // loop through each element and keep adding till we get an equal sum and keep on adding after we get equal as there are negative numbers
        for(int i=0;i<len;i++){ 
            // var for storing sum
           int sum=0;
            // declare j out as it will be used after this loop
            int j=i;
            // loop starting from this element
            for(;j<len;j++){
                sum+=ar[j];
              
                // if sum == required sum 
                if(sum==rsum){
                // print the elements of the sub array in a line
                    // System.out.println("equal");
                    for(int m=i;m<=j;m++){
                        System.out.print(ar[m]+" ");
                    }
                    System.out.println();
                
                }
                   
            }

    
        }
    }

    public static void efficientSolution(int ar[],int requiredSum) {
        //We solve this using maps
        //we add the sum from the beginning to the current index at every index in a map, with sum as a key and its value as the index
        //we iterate this process across every element and we check if the (currentSum - sum) is contained in the map
        // if it is present then we print the sub array that is starting from the next index of (currentSum-sum)

        HashMap<Integer,Integer> hm=new HashMap<>();

        int currentSum=0;
        //hm.put(currentSum,index), initially index is -1
        hm.put(0,-1);

        for(int i=0;i<ar.length;i++){
            currentSum+=ar[i];

            int diff=currentSum-requiredSum;

            if(hm.containsKey(diff)){
                System.out.print("Sub-Array: ");
                int startIndex=hm.get(diff)+1;
                for(int j=startIndex;j<=i;j++){
                    System.out.print(ar[j]+" ");
                }
                System.out.println();
            }

            hm.put(currentSum,i);
        }


    }
}