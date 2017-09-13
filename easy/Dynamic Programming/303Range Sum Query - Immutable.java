import java.util.*;

public class NumArray {

    int[] nums;

    public NumArray(int[] nums) {//前n项
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];//最低项开始
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return nums[j];

        return nums[j] - nums[i - 1];
    }
    public static void main(String[] args){
        List<Integer> digits = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int i = in.nextInt();
        int j = in.nextInt();
        String[] str = input.split(",");
        for (String digitS : str) {
            Integer ai = Integer.parseInt(digitS);
            digits.add(ai);
        }
        //System.out.println(digits.toString());
        //1
      //  Integer[] nums1 = digits.toArray(new Integer [0]);

        //2
      /*  Integer[] nums2 = new Integer[digits.size()];
        digits.toArray(nums2);*/

        //3
        int[] nums3 = new int [digits.size()];
        for(int m = 0;m < digits.size();m++){
            nums3[m] = digits.get(m);
        }

        NumArray obj = new NumArray(nums3);
        int res = obj.sumRange(i,j);
        System.out.println(res);
        in.close();
        return;

       /* for(int x :nums1){
            System.out.println(x);
        }
        for(int x :nums2){
            System.out.println(x);
        }
        for(int x :nums3){
            System.out.println(x);
        }*/
    }
}
