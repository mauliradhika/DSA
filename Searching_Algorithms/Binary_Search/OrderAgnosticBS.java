package Searching_Algorithms.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 10, 22, 33, 45};
        int target = 33;
        int ans = orderAgnosticBS(arr, target);

        System.out.println(ans);
    }

    static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

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
}
