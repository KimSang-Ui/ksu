package org.example.type;

//자바의 문자 자료형 char
//자바는 문자를 2바이트 유니코드로 표현한다.
//작은 따옴표로 묶어서 하나의 문자를 표시한다.
//문자의 저장은 유니코드 값의 저장으로 이어진다.
//
//char ch1 = '헐';
//char ch2 = '확';
//문자 '헐'의 유니코드 값 D5D와 0의 조합 결과 D5D0
//문자 '확'의 유니코드 값 D65와 5의 조합 결과 D655
public class Char_Type {
    public static void main(String[] args) {
//        char ch1 = '헐';
//        char ch2 = '확';
//        char ch3 = 54736;
//        char ch4 = 54869;
//        char ch5 = 0xD5D0;
//        char ch6 = 0xD655;

        char ch1 = '김';
        char ch2 = '상';
        char ch3 = '의';
        char ch4 = 44608;
        char ch5 = 49345;
        char ch6 = 51032;
        char ch7 = 0xAE40;
        char ch8 = 0xC0C1;
        char ch9 = 0xC758;
        System.out.println(ch1 + " " + ch2 + " " + ch3);
        System.out.println(ch4 + " " + ch5 + " " + ch6);
        System.out.println(ch7 + " " + ch8 + " " + ch9);
    }
}
