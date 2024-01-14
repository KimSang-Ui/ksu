package ex03;


class AA{
	public void doA() {
		System.out.println("doA");
	}
}

public class Ex04 {

	public static void main(String[] args) {
//		Integer i = new Integer(10);
		System.out.println(Integer.toBinaryString(10));//10진수를 2진수로 변환한다.
		AA a2 = new AA();// AA를 선언하고 초기화한다.
		a2.doA(); // doA 빌려온다
		
		String a = new String("abcd"); // 문자열 a를 abcd로 초기화 
		System.out.println(a.toUpperCase());// abcd를 대문자로 출력해라
	}
	
}
