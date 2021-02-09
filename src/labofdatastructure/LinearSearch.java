
//Name : محمود قناوي محمود أبو عمر.
//Section : 12

package labofdatastructure;

public class LinearSearch {

    public static void Search(int[] arr, int elem) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                System.out.println("Found at : " + i);
            } else {
                System.out.println("Not found");
            }
            break;
        }
    }
}
