package Algorithm4th;

/**
 * @author vanguo996
 */


public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] a = new int[] {12,23,34,45,56,67,77,88,89};
        System.out.println(bs.recursiveRank(a,0, a.length - 1,67));

    }

    public int recursiveRank(int[] nums, int l, int r, int x) {
        while(l <= r) {
            int mid  = l + (r - l)/2;
            if(nums[mid] == x) return mid;
            else if(nums[mid] < x )
                return recursiveRank(nums, mid + 1, r, x);
            return recursiveRank(nums, l, mid - 1, x);
        }
        return -1;
    }

    public int iterativeRank(int[] nums, int l, int r, int x) {
        while(l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == x) return mid;
            else if(nums[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

}
