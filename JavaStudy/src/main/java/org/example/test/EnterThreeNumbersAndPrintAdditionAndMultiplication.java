package org.example.test;

import java.util.Scanner;

public class EnterThreeNumbersAndPrintAdditionAndMultiplication {
    public static void main(String[] args) {


//      세개 수 입력해서 더하기 곱하기 출력하기
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(i + j + k);
        System.out.println(i * j * k);
    }
}
