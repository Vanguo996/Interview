package Leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] temp = new int[] {2, 9, 7, 2, 15};
        TwoSum p1 = new TwoSum();
        int[] ints = p1.twoSum2(temp, 4);


        for (int i : ints) {
            System.out.println(i);
        }


    }

    //输入数组，和目标值，返回下标值
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[] {i ,j};
                }
            }
        }
        throw new IllegalArgumentException("error");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            //搜索到的key值不能是当前的nums[i]，或者说当前value不能是i
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;

    }


}
