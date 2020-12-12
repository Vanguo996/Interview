package Algorithm4th;

/**
 * @author vanguo996
 */


public class Sort {
    public int[] selectedSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1;j < a.length; j++){
                if(a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;
    }

    public int[] bubbleSort(int[] a) {
        for (int j = 0; j < a.length; j++){
            for (int i = 0; i < a.length - 1 - j; i++){
                if(a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
        return a;

    }

}
