/**created by kangxun on 2017/8/6.
 * 题目：实现2个有序子数组合并成有序数组，而且空间复杂度为0，用原数组nums1保存nums1与nums2的合并结果
 * 1、不使用额外空间，比较从后开始，从大到小存储，因为nums1的数组长度大于m+n，所以后面m～m+n-1位置均为0。
 * 2、若是nums1还有数没有比完（i>-1）,用来存储合并结果的也是nums1，不需要额外处理。
 * 3、若是nums2还有数没有比完（j>-1）,需要做处理，即将剩余元素放到nums1上。
 */
public class solution {
    public static void main(String []args){
        int[] nums1 = new int[7];
        nums1[0] = 1;
        nums1[1] = 6;
        nums1[2] = 79;
        int[] nums2 = new int[]{1,4,5,80};
        solution solu = new solution();
        solu.merge(nums1,3,nums2,nums2.length);
        for(int x:nums1){
            System.out.println(x);
        }

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,index = m+n-1;
        while(i > -1 && j > -1){
            nums1[index--] = (nums1[i] > nums2[j])? nums1[i--] : nums2[j--];
        }
        while(j > -1){
            nums1[index--] = nums2[j--];
        }
    }
}

