package org.example;

public class Main6 {

    public static void main(String[] args) {

        System.out.println("시작");
        try {
            throw new MyException("새로운 예외");//강제로 내가 예외 발생 시킴.
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
