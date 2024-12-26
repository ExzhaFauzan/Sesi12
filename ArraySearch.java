public class ArraySearch {
    public static boolean contains(int[] arr, int n, int target) {
        if (n == 1) {
            return false; 
        }
        if (arr[n - 1] == target) {
            return true; 
        }
        return contains(arr, n - 1, target); 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int target = 10;
        System.out.println(contains(arr, arr.length, target)); 
    }
}
