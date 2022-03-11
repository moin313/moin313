package DAY2;

public class RootDayTwo {
    public static void main(String[] args) {
//        GET FREQUENCY OF THE CHARACTERS IN STRING
//        Frequency.frequency("this is java training");

//        GET INDEX OF SECOND PARAMETER ROM FIRST
        int arr[] = {1,3,5,6,8,9};
//        System.out.println(BinarySearch.binarySearch(arr, 9));

//        GET REVERSE FORM OF THE PASSED ARRAY
        arr = Reverse.reverse(arr);
        for (int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
