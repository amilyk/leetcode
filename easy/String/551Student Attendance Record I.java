/**
 * Created by kangxun on 2017/9/19.
 * 实际上就是看有没有3L，即LLL出现。以及AA出现
 */
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Solution solu = new Solution();
        while(in.hasNext()){
            String input = in.nextLine();
            System.out.println(solu.checkRecord(input));
            //solu.checkRecord(input);
        }
    }
    public boolean checkRecord(String s) {
        int len = s.length();
        int countL = 0,countA = 0;
        for(int i = 0;i < len;i++){
            if(s.charAt(i) == 'A'){//要求不出现超过1次
                countA ++;
                countL = 0;
            }else if(s.charAt(i) == 'L'){
                countL ++;
            }else{
                countL = 0;
            }

            if(countL > 2 || countA > 1){
                return false;
            }
        }
        return true;
    }
}

