import java.util.HashMap;
import java.util.List;



public class VisaInterview {


    private int maxLength (int [] nums, int maxSum)

    {
        int maxLength = 0;
        int currentSum = 0;

        for ( int left=0, right=0; right<nums.length;right++){

            if (currentSum<maxSum)
                currentSum= currentSum+ nums[right];
            else if (currentSum==maxSum){
                maxLength = Math.max(maxLength, right-left+1);
            }
           else if (currentSum>maxSum){
                left+=1;
                currentSum =0;
            }
           else if (currentSum<0){
                currentSum =0;
            }

            left+=1;
            right=left;

        }

        return maxLength;
    }

    void main ( String [] args){
        int [] arr = new int[] {1,2,1,1,1};
        System.out.println(maxLength(arr,3));
    }

}


