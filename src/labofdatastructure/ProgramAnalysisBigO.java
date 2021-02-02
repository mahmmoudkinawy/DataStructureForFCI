package labofdatastructure;

public class ProgramAnalysisBigO {

    //I will explain two sample space of algorthmis
    
    //Big O(n!)
    public static int Factoril(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * Factoril(num - 1);
        }
    }

    //Big O(C)
    public static void Constant(int num) {
        System.out.println(num);
    }
    
    //Big O(n)
    public static void sum(int[] arr)
    {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum +=arr[i];
        }
    }
    
    //There is a lot of algorithms with diffierent time complexitey

}
