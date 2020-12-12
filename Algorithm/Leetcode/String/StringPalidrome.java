package practice.string;

import java.util.Arrays;

/**
 * @author vanguo996
 */

//8.19打卡题，回文子串
public class StringPalidrome {

//    //判断回文串 方法1，空间复杂度N
//    public static boolean isPali(String s){
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if(Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
//
//        }
//        for(int i = 0; i < sb.length() / 2; i++){
//            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) return false;
//        }
//        return true;
//
//    }

    //双指针法
    public static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){

            while(!Character.isLetterOrDigit(s.charAt(left))) left++;
            while(!Character.isLetterOrDigit(s.charAt(right))) right--;
            if(s.charAt(left) != s.charAt(right)) return false;
        }
        return true;

    }

    public static void main(String[] args) {

        String str1 = "aaa";

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));



    }



    public int countSubstring(String str1){
        int count = str1.length();
        for(int i = 0; i < str1.length() - 1; i++){
            for(int j = i + 2; j <= str1.length(); j++){

                if(isPali(str1.substring(i,j))) count++;

            }
        }

        return count;
    }

    public static boolean isPali(String s){
        for(int i = 0; i < s.length() / 2; i++){
            char c = s.charAt(i);
            if(c != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

}
