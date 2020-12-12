package Leetcode.linkedList;
/*
关于链表的五个必知必会
- 单链表反转
- 链表中环的检测
- 两个有序的链表合并
- 删除链表倒数第 n 个结点
- 求链表的中间结点
 */


import java.util.HashSet;
import java.util.LinkedHashMap;

public class LinkedList {



    //反转链表 迭代法
    public ListNode reverse1(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode tmp = curr.next; //使用临时变量保持链表"不断裂"，防止内存溢出
            curr.next = pre; //正式的反转动作
            pre = curr; //更新两个指针的值
            curr = tmp;
        }
        String s = "sdf";
        s.toCharArray();


        return pre;



    }



    public static char firstUniqChar(String s) {
        if( s.length() == 0 ) return ' ';

        HashSet<Character> set = new HashSet<>();

        for( int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);
            set.add( s.charAt(i) );
        }

        for( int j = 0; j < s.length(); j++ ){
            Character c = s.charAt(j);
            if( !set.contains(c) ){
                return c;
            }
        }



        return ' ';

    }

    //反转链表  递归法



    //环形链表的检测

    public static void main(String[] args) {

        firstUniqChar("leetcode");


    }


}
