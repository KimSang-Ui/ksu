package org.example.literals;

public class RealNumber_Literals {
    public static void main(String[] args) {
        System.out.println(3.0004999 + 2.0004999);
        System.out.println(3.0004999D + 2.000499D);
        // 실수는 기본 double형, double형임을 명시하기 위해 d 또는 D 삽입 가능
        System.out.println(3.0004999f + 2.0004999f);
        // 실수형 상수를 float형으로 표현하려면 f 또는 F 삽입
    }
}
// 3.4e3 -> 3.4 * 10 * 10 * 10 = 3400.0
// 3.4e-3 -> 3.4 * 1/10 * 1/10 * 1/10 = 0.0034