package day1;
public class FACTORIAL {
 void factorial() {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
    public static void main(String[] args) {
    	FACTORIAL d = new FACTORIAL();
        d.factorial();
    }
}
