package org.example.test;

import java.util.Scanner;

public class PrintingTrianglesSeparatelyRight {
    public static void main(String[] args) {

//        별로 직각삼각형 출력하기 오른쪽
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
