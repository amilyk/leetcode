/**
 * Created by kangxun on 2017/9/12.
 * 1、父串取与子串长度相同部分依次比较
 * 2、对输入做极端值判断
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 == 0){
            return 0;
        }else if(len1 < len2){
            return -1;
        }
        int threshold = len1 - len2;
        for(int i = 0;i < threshold + 1;i ++){
            if(haystack.substring(i,i+len2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public int strStr2(String haystack,String needle){
        int len1 = haystack.length();
        int len2 = needle.length();
        int threshold = len1 - len2;
        if(len2 == 0){
            return 0;
        }else if(len2 > len1){
            return -1;
        }
        for(int i = 0;i < threshold+1;i++){
            int count = 0;
            while(count < len2 && needle.charAt(count) == haystack.charAt(i + count)){
                count ++;
            }
            if(count == len2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String needle = "kangxun";
        String haystack = "kangxuekangxkangxunkangxun";
        Solution solu = new Solution();
        System.out.println(solu.strStr2(haystack,needle));
        System.out.println();
    }
}
