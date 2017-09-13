import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kangxun on 2017/9/14.
 */

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Solution solu = new Solution();
        System.out.println(solu.reverseWords(input));
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

    public String reverseWords(String s) {
        List<String> arrlist = new ArrayList<>();
        String[] str = s.split(" ");
        for(int i = 0;i < str.length;i++){
            String s2 = reverseString(str[i]);
            arrlist.add(s2);
            if(i != str.length - 1){
                arrlist.add(" ");
            }
        }
        String res = "";
        for(int i = 0;i < arrlist.size();i++){
            res += arrlist.get(i);
        }
        return res;
    }
}
