//Smallest letter that is greater than the target, the array wraps around

package Searching_Algorithms.Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 'm'};
        char target = 'l';
        int ans = smallestLetter(arr, target);

        System.out.println(ans);
    }

    static char smallestLetter(char arr[], char target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }

        return arr[start % arr.length];
    }
}
