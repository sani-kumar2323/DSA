import java.util.*;
public class MaxSumSubArray {
    public static void main(String[] args) {

    }
    // kadanes Algorithum
    public static void MaxSum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int currSum = 0;
        int n = arr.length;
        for(int i= 0; i< n; i++){
            currSum = arr[i];
            ans = Math.max(ans, currSum);
            if(currSum < 0){
                currSum = 0;
            }

        }
        System.out.println(ans);
    }
}
