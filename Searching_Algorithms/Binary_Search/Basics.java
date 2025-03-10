package Searching_Algorithms.Binary_Search;
public class Basics{
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 10, 22, 33, 45};
        int target = 33;
        int ans = binarySearch(arr, target);

        System.out.println(ans);
    }
    //return the index, -1 if doesn't exist
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            //find middle element
            //int mid = (start + end)/2; -> might be possible that start + end exceeds the limit in java
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }

        return -1;
    }
}