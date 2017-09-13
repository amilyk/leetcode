/**
 * Created by kangxun on 2017/9/13.
 */
import java.util.*;
public class Solution {
    //使用字符数组逆序存储，然后输出，会超时
    //swap
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Solution solu = new Solution();
        System.out.println(solu.reverseString(input));
    }
    public String reverseString(String s){
        if(s.length() == 0 || s == null){
            return "";
        }
        char[] str = s.toCharArray();//String to char[]
        int begin = 0;
        int end = s.length()-1;
        while(begin < end){//swap begin<=>end
            char c = str[begin];
            str[begin] = str[end];
            str[end] = c;
            begin ++;
            end --;
        }
        return new String(str);//char[] to String
    }
}
