/**
 * Created by kangxun on 2017/9/8.
 * 不断从左往右定义最小值，若不是最小，max = 当前i位置对应值减去min
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
        int sum = solu.maxProfit(nums);
        System.out.println(sum);
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for(int i = 1;i < n;i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(prices[i] - min,max);
            }
        }
        return max;
    }

}
