package org.example.test;

import java.util.Scanner;

public class EnterTwoNumbersAndOutputMultiplication {

//    두수 입력해서 곱하기 출력하기
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       int dan = sc.nextInt();


       int i = sc.nextInt();

       System.out.println(dan + "*" + i + "=" + dan * i);
   }
}

