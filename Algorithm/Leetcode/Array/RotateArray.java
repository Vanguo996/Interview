package Leetcode.array;

public class RotateArray {

    public void rotate(int[] nums , int k) {
        //先可以写一个每次移动数组元素一次的：
        int tmp,pre;
        //暴力法就是最外层写一个循环k次的。
        pre = nums[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            tmp = nums[i];
            nums[i] = pre;
            pre = tmp;
        }
    }

    //反转的方法
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums, k,nums.length - 1);
        reverse(nums,0, k - 1);

    }

    public void reverse(int[] arr, int start, int end) {
        while(start < end) {

            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }








//        int[] tmp = new int[nums.length];
//        for (int i = 0; i < nums.length - k; i++) {
//            tmp[k] = nums[i];
//            k++;
//        }
//        for (int j = 0; j < k; j++) {
//            tmp[j] = nums[nums.length - 1 - k];
//        }
//        for (int i = 0; i < nums.length -1; i++) {
//            nums[i] = tmp[i];
//        }


}
