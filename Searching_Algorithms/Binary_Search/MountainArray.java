//Peak index in mountain array

package Searching_Algorithms.Binary_Search;

public class MountainArray {
    public static void main(String[] args) {
        
    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //decreasing part of array
                end = mid;
            } else {
                //ascending part of array
                start = mid + 1;
            }
        }
        //start == end after the 2 checks
        return start;
    }
}
