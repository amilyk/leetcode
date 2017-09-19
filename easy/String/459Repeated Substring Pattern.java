/**
 * Created by kangxun on 2017/9/19.
 */
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Solution solu = new Solution();
        while(in.hasNextLine()){
            String input = in.nextLine();
            System.out.println(solu.repeatedSubstringPattern(input));
        }
    }
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int bit = len/2;bit >= 1;bit--){
            if(len%bit == 0) {//子串个数复制多次，在长度上能等于原子串
                int count = len/bit;//一共复制几次
                //String str = "";
                StringBuilder sb = new StringBuilder();
                String sub = s.substring(0,bit);
                for(int i = 0;i < count;i++){
                    sb.append(sub);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
