package ex03;

import java. util.Scanner;
//실수는 소수 두번째
public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		// next() 문자열 입력... 빈공백전까지...
		// nextLine() 문자열 한줄..
		// nextInt() 정수 입력
		// nextDouble() 실수 입력..
		double d = scan. nextDouble();
		
		System.out.println("d="+d);
		
		//45.123123123*100
		//4512 / 100.0-> double
		//45.12
		//double trans_d = (int)(d*100)/100.0;
		//System.out.println("trans_d="+trans_d);
		
		System.out.println("trans_d = "+(int)(d*100)/100.0);
	}

}