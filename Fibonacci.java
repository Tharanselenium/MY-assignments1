package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to 8: " + a + " " + b);

        int next = a + b;
        while (next <= 8) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;
        }
    }



}
