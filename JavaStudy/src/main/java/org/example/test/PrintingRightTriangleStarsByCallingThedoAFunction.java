package org.example.test;

import java.util.Scanner;

public class PrintingRightTriangleStarsByCallingThedoAFunction {
//    doA함수 호출로 직각삼각형 별 출력하기

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        PrintingRightTriangleStarsByCallingThedoAFunction printingRightTriangleStarsByCallingThedoAFunction = new PrintingRightTriangleStarsByCallingThedoAFunction();
        PrintingRightTriangleStarsByCallingThedoAFunction.doA(n);
    }

        public static void doA(int n) {

            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }

        }
    }








