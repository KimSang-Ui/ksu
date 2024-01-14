package ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner 사용
		String a = sc.next();// a의 문자열을 사용
		char str[] = a.toCharArray();// a의 값을 문자열로 바꾸고 str에 넣는다.
		char test1 = 'z';
		char test2 = 'Z';
		char test3 = 'a';
		char test4 = 'A';
		for (int i = 0; i < str.length; i++) {
			if (str[i] > 90)
				str[i] = (char) ((int) str[i] - 32);
			else
				str[i] = (char) (int) (str[i] + 32);
		}
		System.out.println((int) test1);
		System.out.println((int) test2);
		System.out.println((int) test3);
		System.out.println((int) test4);

		System.out.println(new String(str));
	}
}
