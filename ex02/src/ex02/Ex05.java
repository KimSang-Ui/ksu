package ex02;

public class Ex05 {

	public static void main(String[] args) {
		// int double String boolean 4개기억 하도록 합시다..
		
		boolean a = true; // a는 참
		boolean b = false;// b는 거짓
		
		boolean c = false;// c는 거짓
		
		System.out.println(a); //a의 값 출력(참)
		System.out.println(b); //b의 값 출력(거짓)
		System.out.println(c); //c의 값 출력(거짓)
		
		System.out.println(10<20); //참이 출력
		System.out.println(30<20); //거짓이 출력
		
		byte k = (byte)128; 
		System.out.println(k); // byte값의 범위가 127까지라 128을 넘으면 최솟값인 -128이 나온다.
		
		
	}
}
// boolean은 논리 연산자이다. (참과 거짓)