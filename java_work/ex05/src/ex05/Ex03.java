package ex05;

public class Ex03 {

	public static void main(String[] args) {
	
		char a = 'a'; //char a의 값은 'a'
		
		for(int i =0; i<26;i++) { //int i = 0, i가 26미만일 동안 i에 1씩 더한다
			System.out.println(i+"\t"+a++);
		}
		
		a = 'A';
		
		for(int i =0; i<26;i++) {
			System.out.println(i+"\t"+a++);
		}
		
		a = '0';
		System.out.println((int)a);
		
		int b = 0;
		
		for(int i =0; i<26;i++) {
			System.out.println(i+"\t"+a++);
		}
		
	}
	
}
