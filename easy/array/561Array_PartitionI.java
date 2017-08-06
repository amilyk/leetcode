/**created by kangxun on 2017/8/6.
 * 题目：给定一个长度为2n(偶数)的数组，分成n个小组，每组min(ai,bi)，对所有组的i从1到n求和，使sum尽量大
 * 假设：ai<bi
 * 1、公式1:Sum = min(a1,b1)+min(a2,b2)+...+min(an,bn) = a1+a2+..an
 * 2、公式2：S = a1+b1+a2+b2+...+an+bn
 * 3、公式3:Sd = (b1-a1)+(b2-a2)+...+(bn-an) = d1+d2+...+dn
 * 4、公式4由公式1、2、3转换：S = a1+(a1+d1)+a2+(a2+d2)+...+an+(an+dn) = 2Sum + Sd，即Sum = (S - Sd)/2，因为S固定，所以若Sum最大，则Sd最小。
 * 5、先排序，将相邻两个数分为一组，每组较小数都在左边，求和即可
 */
import java.util.*;
public class solution {
    public static void main(String[] args){
        int[] arr = new int[]{1,4,3,2};
        Arrays.sort(arr);
        solution solu = new solution();
        int res = solu.arrayPairSum(arr);
        System.out.println(res);
    }

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
}

