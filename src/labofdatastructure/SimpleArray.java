//Name : محمود قناوي محمود أبو عمر.
//Section : 12


package labofdatastructure;

import java.util.Scanner;

public class SimpleArray {

    @SuppressWarnings("empty-statement")
    public static void HandleInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int num = scan.nextInt();
        
        int[] arr = new int[num];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Number : ");
            arr[i] = scan.nextInt();
        }
    }

}
