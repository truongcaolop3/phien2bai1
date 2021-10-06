/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien2;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class bai8 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số tự nhiên n = ");
        int n = sc.nextInt();
        System.out.printf("Các số fibonacci nhỏ hơn %d và "
                + "là số nguyên tố: ", n);
        int i = 0;
        while (fibonacci(i) < 100) {
            int fi = fibonacci(i);
            if (snt(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
    }
     
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static boolean snt(int n) {

        if (n < 2) {
            return false;
        }
       
        int c = (int) Math.sqrt(n);
        for (int i = 2; i <= c; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
