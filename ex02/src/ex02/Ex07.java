package ex02;

import java.util.Scanner;

// 7장 가면 자세히 할꼐요...
class AA{
	public void doA() {
		System.out.println("AA.doA()");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// 기본형
		int a= 10;
		// 참조형 타입 변수 선언
		Scanner scan = new Scanner(System.in);//입력한 걸 가져와라
		System.out.println("입력 하세요 ! ");// "입력하세요!" 출력
		
		String inputString = scan.nextLine(); //nextline은 문자열
		System.out.println(inputString); //inputString의 값을 출력해라
		
		// 참조형 타입 변수 선언
		AA aa = new AA();
		aa.doA();
//		scan.

	}
	
}
