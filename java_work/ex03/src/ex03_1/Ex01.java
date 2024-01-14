package ex03_1;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(3%2);
		
		// 0010 2진수
		// 1000 => 8
		System.out.println(2<<2);
		
		System.out.println(10>3);//10은 3보다 크다 참
		System.out.println(10<=3);//10이 3보다 작거나 같다. 거짓
		
		System.out.println(10==10); // 10은 10이다 참
		System.out.println(10!=10); // 10은 10이 아니다 거짓
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b); //10은 20이다 거짓
		System.out.println(a!=b); //10은 20이 아니다 참
		
	}
}
