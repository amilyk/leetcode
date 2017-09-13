/**
 * Created by kangxun on 2017/9/8.
 */
import java.util.*;
public class Solution {
    public static void main(String[] args){
        List<Integer> digits = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] str = input.split(",");
        for(String digitS:str){
            int number = Integer.parseInt(digitS);
           digits.add(number);
        }
        int nums[] = new int[digits.size()];
        for(int i = 0;i < digits.size();i++){
            nums[i] = digits.get(i);
        }
        Solution solu = new Solution();
        int sum = solu.maxSubArray(nums);
        System.out.println(sum);
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        dp[0] = nums[0];
        for(int i = 1;i < n;i++){
            dp[i] = nums[i] + (dp[i-1] > 0?dp[i-1]:0);
            max = Math.max(dp[i],max);
        }
        return max;
    }

}
