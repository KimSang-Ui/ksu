package ex03;

import java.util.Scanner;

/*
 * 입력받은 n 만큼 str 값을 출력해라...
 */

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scanner 사용

		System.out.println("문자열 입력");// 문자열 입력을 출력해라
		String str = scan.next(); //문자열 str안에 저장해라
		
		System.out.println("반복횟수 입력");//반복횟수 입력을 출력해라
		int n = scan.nextInt();//문자열 int안에 저장해라
		
		System.out.println("str = " + str);//str 값을 출력해라
		System.out.println("n = " + n);// n의 값을 출력해라
		
		for (int i=0; i<n;i++) { // int i=0, i가 n미만이면 i 1씩 증가.
			System.out.println(str);// str의 갑을 출력해라.
		}
	}

}
