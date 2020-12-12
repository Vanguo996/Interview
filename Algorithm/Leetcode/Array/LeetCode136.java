package Leetcode.array;

import java.util.HashSet;

/**
 * @author vanguo996
 * 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 方法一：
 * 用容器解决，set或者map，都可以记录出现次数
 */


public class LeetCode136 {


    //额外空间复杂度
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    //额外空间复杂度O(N),位运算
    //异或运算满足交换律和结合律，异或运算符？ ^=

    public int solution1(int[] nums) {
        int target = 0;
        for( int i : nums) {
            target ^= i;
        }
        return target;
    }


}
