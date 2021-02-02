package labofdatastructure;

public class FindingMaxElementInArray {

    public static void find(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);
    }
}
