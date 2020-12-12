package Leetcode.array;

/**
 * @author vanguo996
 * 2020.5.22
 */


public class LeetCode1010 {

    /**
    * @Description 这是一个包含歌曲长度的数组，每个元素就是一首歌曲的长度time，1<= time <= 60000
    * 现在要取得任一两个元素相加能够整除60的组合。
    * @return 返回组合的个数
    * @param time 包含歌曲时间的数组
    */


    /*
    思路:
        1. 暴力法：
        循环遍历两层，(time[i] + time[j]) % 60 == 0 count ++;
        2. 哈希表：
        数组遍历，把元素作为哈希的key，出现的次数作为value。
            把每个元素对60取余，num = num%60
            判断num是否为0，不为0时：map.containsKey(num)
                在map中通过key找出value并赋值给count：count += map.get(num)
            else if 如果num=0，那么配对的也是余数为0的：
                记录0的配对次数，map.put(key, value); value = map.getOrDefault(0,0) + 1
            else
                没有配对到，把余数的配对余数存储在map中
                target = 60 - num
                map.put(target, map.getOrDefault(target, 0) + 1)

            循环完成返回count值


        3.数组法：
        既然map的键是有限可控的，即0-60， 那么可以考虑用数组来替代。
            取余




     */

    public int numPairsDivisibleBy60(int[] time) {
        int[] record = new int[60];
        int count = 0;



        return count;
    }


}
