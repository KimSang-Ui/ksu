package org.example.blockComment;

/* 파일이름: BlockComment.java
작성자: 김상의
작성일: 2024년 3월 2일
목적: System.out.println 메소드의 기능 테스트
 */ // 블록 단위 주석처리 영역

public class BlockComment {
    public static void main(String[] args) {
        /* 다음은 단순한 정수의 출력*/ //주석 처리영역
        System.out.println(7);

        System.out.println(3.15);
        System.out.println("7 + 7 = " + 14);
        System.out.println(3.15 + "는 실수입니다.");
        System.out.println("7 + 7" + " 의 연산 결과는 14입니다.");

        /*다음은 덧셈 결과의 출력*/ // 주석 처리 영역
        System.out.println(7 + 7);
    }
}
