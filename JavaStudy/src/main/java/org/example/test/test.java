package org.example.test;

//public class test {
//  두수 입력해서 곱하기 출력하기
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int dan = sc.nextInt();
//
//
//        int i = sc.nextInt();
//
//        System.out.println(dan + "*" + i + "=" + dan * i);
//    }
//}
//
//public class test {
//    public static void main(String[] args) {
//
//


//        n의 배수구하기
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= 100; i++) {
//            if (i % n == 0) {
//
//                System.out.println(i);
//            }
//
//        }
//    }
//}
//        세개 수 입력해서 더하기 곱하기 출력하기
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        int j = sc.nextInt();
//        int k = sc.nextInt();
//        System.out.println(i + j + k);
//        System.out.println(i * j * k);

//        두 수 입력해서 100 까지의 수중에서 최소공배수와 최대공약수 출력하기

//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        for (int i = 0; i <= 100; i++) {


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//        별로 직각삼각형 출력하기 오른쪽
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//별로 직각삼각형 출력하기 왼쪽
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = n; i < j; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//  doA함수 호출로 직각삼각형 별 출력하기
//public class test {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        org.example.test.test test = new org.example.test.test();
//        test.doA(n);
//
//
//    }
//
//    public void doA(int n) {
//
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//
//    }
//}
// doB함수 호출로 String형을 int형으로 바꾸기
public class test {
    public static void main(String[] args) {

        test test = new test();

        test.doB();

    }

    private void doB() {
        String a = "1010";
        int a1 = Integer.parseInt(a);
        String b = "010";
        int b1 = Integer.parseInt(b);
        System.out.println(a1);
        System.out.println(b1);
    }
}