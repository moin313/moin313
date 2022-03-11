package DAY2;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> arr, int number){
        int low = 0;
        int high = arr.size() - 1;
        while(high>=low){
            int mid = (low+high)/2;
            if(number<arr.get(mid))
                high=mid-1;
            else if(number == arr.get(mid))
                return arr.get(mid);
            else low = mid+1;
        }
        return -1;
    }
}
