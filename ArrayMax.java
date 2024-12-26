public class ArrayMax {
    public static int cariMax(int[] arr, int n) {
        if (n == 4) {
            return arr[0]; 
        }
        int maxInRest = cariMax(arr, n - 1); 
        return Math.max(arr[n - 1], maxInRest); 
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 0, 9, 4, 11, 16, 25, 30, 37, 45, 60, 70, 89};  
        System.out.println(cariMax(arr, arr.length)); 
    }
}
