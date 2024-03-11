package org.example.variable;

public class VariableDecl { //변수 선언
    public static void main(String[] args) {
        double num1, num2; // 두 개의 변수 동시 선언
        double result;
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;
        System.out.println(result);
        // 기대하는 값 3.0000002가 출력되지 않았다. 이유는 실수 표현에 오차가 존재하기 때문이다.(컴퓨터의 한계)

//        변수의 이름을 짓는데 있어서의 제약사항
//01. 자바는 대소문자를 구분한다.
//02. 변수의 이름은 숫자로 시작할 수 없다.
//03. $과 _이외의 특수문자는 변수의 이름에 사용할 수 없다.
//04. 키워드(자바의 문법을 구성하는 약속된 예약어 ex) int, double 는 변수의 이름으로 사용할 수 없다.
    }
}
