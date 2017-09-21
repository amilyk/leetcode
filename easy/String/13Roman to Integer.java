/**
 * Created by kangxun on 2017/9/20.
 */
import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Solution solu = new Solution();
        while(in.hasNext()){
            String input = in.nextLine();
            System.out.println(solu.romanToInt(input));
        }
    }
    public int romanToInt(String s) {
        int nums[] = new int[s.length()];
        for(int i = 0;i < s.length();i++){//字符串从高位开始读，int数组从低位开始存
            switch (s.charAt(i)){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;

            }
        }
        int sum = 0;
        for(int i = 0;i <  s.length()-1;i++){//相邻位之间，左边比右边大，相加。左边比右边小，右边减左
            //因为从i = 0开始，所以其实读的也是高位。[i]高位左 [i+1]低1位右。即IV，5-1 = 4。
            if(nums[i] < nums[i+1]){//左边小于右边，相减
                sum -= nums[i];//适用于只有1位，不满足该条件，直接加本身 如V
                //因为len-1 +1不存在，越界，所以加到< len-1
            }else{
                sum += nums[i];
            }
        }
        sum = sum+nums[ s.length()-1];
        return sum;
    }
}
