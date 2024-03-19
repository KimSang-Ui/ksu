package org.example.type;

// byte : 1 byte, short: 2 byte, int: 4byte long: 8 byte
// 변수의 자료형 결정은 '해당 변수에 값을 저장 및 참조하는 방식의 결정'을 의미한다.
public class Integer_Type {
    public static void main(String[] args) {
        short num1 = 34;
        short num2 = 25;
//      short result = num1 + num2; // 컴파일 에러는 정수형 덧셈 시 자료형에 상관없이 int 형 덧셈을 진행함을 의미한다.
        int result = num1 + num2;
        System.out.println(result);
    }
}
