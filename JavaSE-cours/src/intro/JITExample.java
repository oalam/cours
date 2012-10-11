/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author adminl
 */
public class JITExample {

    private static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
    
        return fibo(n - 1) + fibo(n - 2);
    }

    private static long time(int n) {
        long time = System.nanoTime();
        for (int i = 0; i < 20; i++) {
            fibo(n);
        }
        long time2 = System.nanoTime();
        return time2 - time;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(time(10));
        }
    }
}
