package org.example.variable;

public class UseVariable {
    public static void main(String[] args) {


        int num1; // 변수 num1의 선언
        num1 = 30; // 변수 num1에 10을 저장

//    자바에서 = 은 '같다'가 아닌 '대입'의 의미이다.
//    대입은 오른쪽에 있는 값을 왼쪽으로

        int num2 = 40; // 변수 num2 선언과 동시에 20으로 초기화
        int num3 = num1 + num2; // 두 변수 값을 대상으로 덧셈
        System.out.println(num1 + " + " + num2 + " = " + num3);
    }
}

