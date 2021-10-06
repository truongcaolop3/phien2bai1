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
public class bai2 {
private static Scanner scanner = new Scanner(System. in );
  public static void main(String[] args) {
    System.out.print("Nhập số nguyên dương n = ");
    int n = scanner.nextInt();
    System.out.println("Giai thừa của " + n + " là: " + tinhGiaithua(n));
  }
  public static long tinhGiaithua(int n) {
    if (n > 0) {
      return n * tinhGiaithua(n - 1);
    } else {
      return 1;
    }
  }
}

