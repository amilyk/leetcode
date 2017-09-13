import java.util.ArrayList;

/**
 * Created by kangxun on 2017/9/12.
 */
import java.util.*;
public class Solution {
    public String reverseStr(String s, int k) {
        List<String> arr = new ArrayList<>();
        int threshold = (s.length()/(2*k)+1);
        int i =0;
        for(int count = 0;count < threshold;count ++){
            if(count == threshold -1){
                arr.add(s.substring(i, s.length()));
            }else{
                arr.add(s.substring(i, i + 2 * k));
            }
            i=i+2*k;
        }
        for(int count = 0;count < threshold;count++){
            arr.set(count,reverse_str(arr.get(count),k));
        }
        String listString = "";

        for (String single : arr)
        {
            listString += single;
        }

        return listString;

    }
    public String reverse_str(String s,int k){
        char[] array = s.toCharArray();
        int len = s.length();
        String reverse = "";  //注意这是空串，不是null
        if(len < k){//reverse all
            for (int i = array.length - 1; i >= 0; i--){
                reverse += array[i];
            }
        }else{
            for (int i = k - 1; i >= 0; i--){
                reverse += array[i];
            }
            for(int i = k;i < s.length();i++){
                reverse += array[i];
            }
        }
        return reverse;
    }

    public static void main(String[] args){
        Solution solu = new Solution();
        String s = "abcdefg";
        int k = 2;
        solu.reverseStr(s,k);
    }
}
