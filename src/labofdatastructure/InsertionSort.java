
//Name : محمود قناوي محمود أبو عمر.
//Section : 12

package labofdatastructure;

import java.util.Arrays;

public class InsertionSort {

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        
        //print array after sorting
        System.err.println(Arrays.toString(arr));
    }

}
