package practice.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author vanguo996
 */


public class LeetCode459 {
    //重复子串
//    public boolean repeatedSubstringPattern(String s) {
//        Set<Character> set = new HashSet<>();
//
//        for(int i = 0; i < s.length(); i++){
//            Character c = s.charAt(i);
//            if(!set.contains(c)){
//                set.add(c);
//            } else {
//                int m = 0;
//                int n = i;
//                while(m < i){
//                    if(s.charAt(m) != s.charAt(n)) return false;
//                    m++;
//                    n++;
//                }
//                return true;
//
//            }
//        }
//        return false;
//
//    }

    //方法1：利用API匹配
    public static boolean repeated(String s){
        //匹配从索引1开始，
        //如果索引结果为字符串长度，因为总的字符串由两个s拼接而成，所以s出现的第一个地方就是
        //本身字符串开始的地方，
        // 意味着整个字符串就是重复的子串，
        //所以没有重复的子串

        int i = (s + s).indexOf(s, 1);
        System.out.println(i);


        return false;
    }

    public static void main(String[] args) {

        repeated("ababc");
        System.out.println("123".indexOf("2", 0));
    }


}
