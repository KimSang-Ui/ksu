package org.example.integer;

// 부호 비트가 0이면 양의 정수, 1이면 음의 정수
//00011001 : 양의 정수 + 25, 10011001 음의정수 - 25
//첫번째가 부호비트
// 부호 비트가 0이면 나머지 비트들은 값의 크기를 결정.
// 음의 정수를 표현하는 방법
// 양의 정수의 이진수 표현에 2의 보수를 취한 결과를 음의 정수로 표현한다.
// 이 경우 임의의 양의 정수가 있을 때 이와 절댓값이 같은 음의 정수의 합은 0이 된다.
// ex) 00000101 : 정수 +5 -> 1의 보수 11111010 -> 1을 더한다. 11111011 : + 5의 2의 보수
// + 정수 5의 비트와 5의 2의 보수의 비트를 합쳤을 때 올림 수 는 버린다.
// 1의 보수란 0은 1로 1은 0으로 바꾸는 것이다.

public class Integer {
}
