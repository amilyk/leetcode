/**
* created by kangxun on 2017/8/5
* 题目：用int数组存一个自然数，用数组实现数加1操作
* 1、数组存的时候，第0位到第len-1位分别对应数的高位到个位，如592，在数组里0-2位置，但是第2位为个位，求加操作从个位开始。
* 2、每次进位，当前位加上前一位的高位，用临时数tmp保存，然后按10取余，低位作为当前位，高位存着，用于后一位进位使用。第一次进位，高位为1，实现加1操作。
* 3、若首位需要进位，需要增加数组len+1长度，最高位设置1，其他为0即可。
*/
public class solution {
    public static void main(String []args){
        //System.out.println("hello")
        int[] mylist  = new int[]{9};

        solution solu = new solution();
        int[] result = solu.plusOne(mylist);

        for(int x:result){
            System.out.print(x);
            //System.out.println();
        }
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int high = 1,tmp;
        for(int i = len-1;i >= 0;i --){
            tmp = digits[i] + high;//加上前一位进位
            digits[i]  = tmp % 10;//低位
            high = tmp / 10;//进位
        }
        if(high > 0){//如果最高位也要进位
            int[] newdigits = new int[len+1];
            newdigits[0] = 1;
            return newdigits;
        }
        return digits;
    }

}

