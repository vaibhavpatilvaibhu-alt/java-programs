package day1;
public class FIBONACCI {
    void fibonacci() {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
    	FIBONACCI d = new FIBONACCI();
        d.fibonacci();
    }
}