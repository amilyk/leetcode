/**
 * Created by kangxun on 2017/9/21.
 * 整体逻辑判断是不是回文，如果是就是，不是就试下删除一个字符后是否为回文。方法如下
 * 首先整体判断下，如果遇到不相等的字符，就判断下左边加一个，或右边减一个是不是回文，如果是就是回文，仍然不是就返回false
 */
import java.util.*;
public class Solution {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Solution solu = new Solution();
        while(in.hasNextLine()){
            String input = in.nextLine();
            System.out.println(solu.validPalindrome(input));
        }
    }
    public boolean validPalindrome(String s) {
        int len = s.length();
        int head = 0;
        int tail = len - 1;
        while(head < tail && s.charAt(head) == s.charAt(tail)){
                head ++;
                tail --;
        }
        if(head >= tail){//因为head < tail不满足跳出，则s.charAt(head) == s.charAt(tail)一直满足
            return true;
        }
        if(isPalindrome(s,head,tail-1)||isPalindrome(s,head+1,tail)){
            return true;
        }else{
            return false;
        }
        /*if(isPalindrome(s,head,tail-1)){//返回删除的字符，删除后不回文返回false
            return s.charAt(tail);
        }else if(isPalindrome(s,head+1,tail)){
            return s.charAt(head);
        }else{
            return 'n';
        }*/

    }
    public boolean isPalindrome(String s,int i,int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
