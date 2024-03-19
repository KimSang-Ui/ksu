package org.example.constants;

//  자바에서 말하는 '상수'
// - 변수에 값을 딱 한 번만 할당할 수 있으면 그것은 상수!
// - 한번 할당된 값은 변경이 불가능하다.
// - 키워드 final 선언이 붙어있는 변수

//final 기반의 상수 선언의 예
//- 상수의 이름은 모두 대문자로 짓는 것이 (지켜야하는)관례
//- 이름이 둘 이상의 단어로 이뤄질 경우 단어를 언더바로 연결하는 것이 관례
//ex) final int MAX_SIZE = 100; // 상수 선언의 예 초기화 하지 않으면 딱 한번 초기화 가능하다.
public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 1500;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED = 25; // 할당 하지 않았던 상수의 값 할당

        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
    }
}
