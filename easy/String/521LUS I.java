/**
 * Created by kangxun on 2017/9/14.
 * 最长不同子序列。如果A==B，长度为-1。如果A!=B，如abc与abcd,或abc、abd，其实是完全不相同的。长度为2序列中最长的。
 */
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        Solution solu = new Solution();
        System.out.println(solu.findLUSlength(input1,input2));
    }
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

}
