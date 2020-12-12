package Algorithm4th;
import java.util.Iterator;
/**
 * @author vanguo996
 * 算法1.1   下压栈 LIFO  通过动态调整数组大小的实现
 */


public class Stack<Item> implements Iterable<Item> {

    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public void resize(int max) {
        Item[] tmp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            tmp[i] = a[i];
        a = tmp;
    }

    public void push(Item item) {
        //先查看数组的空间大小
        if(N == a.length) resize(2*a.length);
        a[N++] = item;  //这里的N是在栈顶的指针，

    }

    public Item pop() {
        Item item = a[--N]; //取出栈顶的元素
        //避免对象游离——即已经删除的对象还是被引用。所以这里需要把弹出的对象设置为null，
        a[N] = null;
        //动态调整容量大小
        if(N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }

    //后一部分的迭代不是很懂什么意思

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>  {
        //支持先进后出的迭代
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;

        }
    }





}
