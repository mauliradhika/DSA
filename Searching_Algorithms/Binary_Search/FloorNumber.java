//Floor number is the largest integer that is less than or equal to a given number

package Searching_Algorithms.Binary_Search;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 10, 22, 33, 45};
        int target = 33;
        int ans = floorNumber(arr, target);

        System.out.println(ans);
    }

    static int floorNumber(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }

        return end;
    }
}
