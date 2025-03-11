package Searching_Algorithms.Binary_Search;

public class FindInMountain {
    public static void main(String[] args) {
        
    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int orderAgnosticBS(int arr[], int target, int start, int end){

        //find whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find middle element
            //int mid = (start + end)/2; -> might be possible that start + end exceeds the limit in java
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                } 
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                } 
            }
        }

        return -1;
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
