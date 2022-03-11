package DAY2;

public class Reverse {
    public static int[] reverse(int []arr)
    {
        int n= arr.length-1;
        int temp;
        for(int i=0;i< arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;
        }
        return arr;
    }

}
