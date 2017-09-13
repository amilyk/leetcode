/**
 * Created by kangxun on 2017/9/8.
 * 二分查找树的定义是，左子树节点均小于root，右子树节点均大于root！
 * n个点中每个点都可以作为root，当 i 作为root时，小于 i  的点都只能放在其左子树中，大于 i 的点只能放在右子树中，此时只需求出左、右子树各有多少种，二者相乘即为以 i 作为root时BST的总数。
 */
import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int digits = in.nextInt();
        Solution solu = new Solution();
        int res = solu.numTrees(digits);
        System.out.println(res);
    }
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i = 2;i <= n;i++){//n个结点
            for(int j = 1;j <= i;j++){//结点数确定时候。以哪个为根结点
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
