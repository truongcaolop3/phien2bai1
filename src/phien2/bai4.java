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
public class bai4 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n = ");
    int n = sc.nextInt();
    System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: n", n);
    if (n >= 2) {
      System.out.print(2);
    }
    for (int i = 3; i < n; i += 2) {
      if (snt(i)) {
        System.out.print(" " + i);
      }
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
