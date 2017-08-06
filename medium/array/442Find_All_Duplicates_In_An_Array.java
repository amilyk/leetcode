/**created by kangxun on 2017/8/6.
 * 题目：返回元素大小在1-n（数组长度）范围内的数组中的重复元素（即出现2次），要求复杂度o(n)不能排序，要求空间复杂度o(1) 不能用hash
 * 1、定义index，为元素值减1
 * 2、依次遍历数组元素，将元素转为负值，若再次读到相同index对应值为负，则该元素出现2次。1个index，对应一个nums[i]，index不一定等于i
 */
import java.util.*;

public class solution {
    public static void main(String []args){
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        solution solu = new solution();
        List<Integer> mylist = solu.findDuplicates(nums);
        System.out.println(mylist);
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> mylist = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                mylist.add(Math.abs(index + 1));
            }else{
                nums[index] = - nums[index];
            }
        }
        return mylist;
    }
}

