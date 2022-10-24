package JavaClasses;
//Binary Search Sorted Array
public class BinarySearch {
    int binarySearch (int arr[], int left, int right, int key) {
        int mid = left + (right-left) / 2;
        if(right >= left) {
            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] > key) {
                return binarySearch(arr, left, mid-1, key);
            }
            return binarySearch(arr, mid+1, right, key);
        }
        return -1;
    }
}
