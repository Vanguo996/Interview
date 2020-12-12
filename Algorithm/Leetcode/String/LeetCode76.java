package Leetcode.string;

import java.util.HashSet;

/**
 * @author vanguo996
 *
 * 二进制求和，
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *
 */


public class LeetCode76 {

    public void Solution(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;//进位

        for(int i = 0, j = 0; i < a.length() - 1 || j < b.length() - 1 ; i++, j++) {
            int sum = carry;


        }




    }


    public static void main(String[] args) {


        int i = lengthOfLongestSubstring(" ");

        String b = longestPalindrome("bb");
        System.out.println(b);

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int tmp = 0;
        for( int i = 0; i < s.length() - 1; i++ ){
            set.clear();
            set.add(s.charAt(i));
            for( int j = i + 1; j < s.length(); j++ ){
                if( !set.contains(s.charAt(j)) ) {
                    set.add(s.charAt(j));
                } else {
                    break;
                }

            }



            tmp = Math.max(tmp, set.size());
        }
        return tmp;
    }

    public static String longestPalindrome(String s) {

        if( s.length() < 2 ) return s;

        int length = s.length();
        int max = 1;
        int begin = 0;

        for( int i = 0; i < length - 1; i++ ){
            for( int j = i + 1; j < length; j++ ){
                String sub = s.substring(i, j);
                if( sub.length() > max && verify(sub, i, j) ) {
                    begin = i;
                    max = sub.length();
                }
            }
        }

        return s.substring(begin, begin + max);
    }

    public static boolean verify(String s, int left, int right) {

        while( left < right ) {
            if( !(s.charAt(left) == s.charAt(right) )) {
                return false;
            }
            left++;
            right--;

        }

        return true;

//        for( int i = 0; i < length; i++ ){
//            if( !(s.charAt(i) == s.charAt(length - i - 1 )) ){
//                return false;
//            }
//        }
//        return true;
    }





}
