package Leetcode.array;


public class RemoveDuplicate {
    //双指针法，
    public int remove(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[temp] != nums[i]) {
                temp++; //慢指针向前移动
                nums[temp] = nums[i]; //把现在的值给 以慢指针为索引的数组元素
            }
        }
        return temp + 1; // 数组的长度
    }

    //国际站的 最优解
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0; //三元运算符
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }

    public int removeDuplicate(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
