package ex03;


class AA{
	public void doA() {
		System.out.println("doA");
	}
}

public class Ex04 {

	public static void main(String[] args) {
//		Integer i = new Integer(10);
		System.out.println(Integer.toBinaryString(10));
		AA a2 = new AA();
		a2.doA();
		
		String a = new String("abcd");
		System.out.println(a.toUpperCase());
	}
	
}
