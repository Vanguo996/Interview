package practice.backtrace;

/**
 * @author vanguo996
 */
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import practice.tree.TreeNode;

import java.util.*;

public class LeetCode46 {
    //全排列问题，回溯算法

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-5};

//        System.out.println(task5("minusplus"));
//        System.out.println(task4("Sat", 23));
        System.out.println(foo(arr));
    }


    public static int foo(int[] arr){
        int res = arr[0];
        for (int value : arr) {
            if (value == 0) return 0;
        }

        for(int i = 1; i < arr.length; i++){
            res *= arr[i];
        }

        if(res < 0){
            return -1;
        } else {
            return 1;
        }
    }


    public static String task4(String s, int k){
        String[] str = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int delay = k % 7;
        for(int i = 0; i < str.length; i++){
            if(s.equals(str[i])){
                 int temp = i + delay;
                 if(temp > 6){
                     return str[temp % 7];
                 }
                return str[temp];
            }
        }
        return null;
    }

    public static String task5(String s){
        String s1 = "minus";
        String s2 = "plus";

        String temp = s.replaceAll(s1, "-");
        String res = temp.replaceAll(s2, "+");
        return res;
    }

//    public static String task6(int n){
//        Map<Character, Integer> map = new HashMap<>();
//
//
//
//
//    }



}
