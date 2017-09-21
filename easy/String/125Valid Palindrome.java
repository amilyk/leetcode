/**
 * Created by kangxun on 2017/9/21.
 * 只比较字母和数字，所以碰到非字母数字的就跳过不比较。
 * 忽略大小写，所以比较字母和数字时候，转成相同小写或大写比较
 * 只要出现首、尾不相等，返回false
 * 这里特例，空字符串，返回true
 */
import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Solution solu = new Solution();
        while(in.hasNextLine()){
            String input = in.nextLine();
            System.out.println(solu.isPalindrome(input));
        }
    }
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int len = s.length();
        int head = 0;
        int tail = len -1;

        while(head <= tail){
            char charhead = s.charAt(head);
            char chartail = s.charAt(tail);
            if(!(Character.isLetterOrDigit(charhead))){//前面遇到非字母数字跳过
                head ++;
            }else if(!(Character.isLetterOrDigit(chartail))){//后面遇到非字母数字跳过
                tail --;
            }else{
                if(Character.toLowerCase(charhead) != Character.toLowerCase(chartail)){//字母转为小写，只要出现首、尾不相等，返回false
                    return false;
                }else{//相等就往左指针往后，右指针往前 判断
                    head ++;
                    tail --;
                }
            }
        }
        return true;
    }
}
