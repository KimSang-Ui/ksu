package org.example.test;

import java.util.Scanner;

//public class test {
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
public class test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {

                System.out.println(i);
            }

        }
    }
}
