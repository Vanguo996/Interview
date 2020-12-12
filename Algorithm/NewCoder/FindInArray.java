package newCode;

/**
 * @author vanguo996
 *  在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *  请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *  考察点，二分查找，
 */


public class FindInArray {


    //方法一：暴力法遍历二维数组，
    public boolean Find(int target, int [][] array) {

        for( int i = 0; i < array.length; i++ ) {
            for( int j = 0; j < array[0].length; j++ ) {
                if( target == array[i][j] ) {
                    return true;
                }
            }

        }
        return false;

    }

    //暴力法过后，发现一个条件没有使用，就是数组是递增的。
    //所以可以使用二分查找。

    //一维数组中的二分查找
    public boolean BinarySearch(int target, int[] array, int l, int r) {

        while( l <= r ){
            int mid = l + (r - l) /2;
            if( array[mid] == target ) return true;
            else if( array[mid] > target ) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }

    /**
    * @Description 利用升序的条件，选取右上角或左下角的值。
    *
    */

    public boolean bsInArr(int target, int[][] array) {

        int row = 0;
        int col = array.length - 1;

        while( row < array[0].length && col >= 0 ){
            int val = array[row][col];
            if( target > val ) {
                //下移
                row++;
            } else if( target < val ) {
                //左移
                col--;
            } else {
                return true;
            }

        }
        return false;

    }



}
