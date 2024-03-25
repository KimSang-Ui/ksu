package org.example.test;

public class ConvertingStringtypeToIntTypeByCallingdoBFunction {
    public static void main(String[] args) {
//        doB함수 호출로 String형을 int형으로 바꾸기


        ConvertingStringtypeToIntTypeByCallingdoBFunction convertingStringtypeToIntTypeByCallingdoBFunction = new ConvertingStringtypeToIntTypeByCallingdoBFunction();

        ConvertingStringtypeToIntTypeByCallingdoBFunction.doB();

    }

    private static void doB() {
        String a = "1010";
        int a1 = Integer.parseInt(a);
        String b = "010";
        int b1 = Integer.parseInt(b);
        System.out.println(a1);
        System.out.println(b1);
    }
}

