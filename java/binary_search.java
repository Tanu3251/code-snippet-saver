public class BinarySearch {

    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6};
        int result = binarySearch(arr, 4);

        System.out.println("Element found at index: " + result);
    }
}
