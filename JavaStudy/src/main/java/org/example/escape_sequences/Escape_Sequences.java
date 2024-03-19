package org.example.escape_sequences;

/*
이스케이프 시퀀스(escape sequences)
'\b' 백스페이스 문자
'\t' 탭 문자
'\\' 백슬래시 문자
'\'' 작은따옴표 문자
'\"' 큰따옴표 문자
'\n' 개 행 문자
'\r' 캐리지 리턴(carriage return) 문자
화면상의 어떠한 상황 또는 상태를 표현하기 위해 약속된 문자
 */

public class Escape_Sequences {
    public static void main(String[] args) {
        System.out.println("김상의" + '\b' + '의');
        System.out.println("17 : " + '\t' + '8');
        System.out.println("AB" + '\n' + 'C');
        System.out.println("AB" + '\r' + 'C'); // C가 A의 자리로 가고 A는 사라진다.

    }
}
