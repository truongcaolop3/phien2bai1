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
public class bai7 {
    private static final Scanner sc = new Scanner(System.in);
	public static int a = 10;
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong : ");
            int n = sc.nextInt();
            System.out.printf("Tong cac chu so "
                    + "cua %d la: %d", n, tong(n));
        }
    public static int tong(int n) {
        int total = 0;
        do {
            total = total + n % a;
            n = n / a;
        } while (n > 0);
        return total;
    }
}
