package org.example.test;

import java.util.Scanner;

public class FindingMultiplesOfN {
    public static void main(String[] args) {


//      n의 배수구하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {

                System.out.println(i);
            }
        }
    }
}

