package practice.bit;

import java.util.Arrays;

/**
 * @author vanguo996
 */


public class LeetCode201 {
    //按位于
    //二进制串公共前缀问题，
    //方法1：使用位移法

    public static int test(int m, int n){

        int sum = 1;
        while(m <= n){
            sum = sum & m++;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(test(3,7));
    }

}
