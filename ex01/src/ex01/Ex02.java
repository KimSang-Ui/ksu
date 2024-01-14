package ex01;

import java.util.ArrayList;
import java.util.List;

// 재생버튼
// 마우스 우클릭 Run as -> Java application
// ctrl + f11
public class Ex02 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();

		int a = 10; // int a = 10이라는 뜻은 a를 int형으로 10을 부여한다.
		System.out.println("a = "+ a); // 출력은 "a =" 쌍따옴표를 한거는 그대로 나오기 위한 문자열 출력방식
										//+a는 a를 같이 더해서 출력하라는 뜻
		int b = 20;
		System.out.println("a + b = "+(a+b));
		
		String c = "a";
		String d = "b";
		System.out.println(c+d);
		
		// a = 10
		// b = 20
	}
}

