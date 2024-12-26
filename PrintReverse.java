public class PrintReverse {
    public static void printReverse(int n) {
        if (n <= 0) {
            return; 
        }
        System.out.println(n); 
        printReverse(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; 
        printReverse(n); 
    }
}
