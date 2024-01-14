package ex03;

public class Ex08 {

	// 1byte -128 ~ +127
	
	public static void main(String[] args) {
		char aa = 'A';//char aa는 'A'
		System.out.println(aa); // aa를 출력하면 'A'
		int bb = (int) aa; // char aa를 int aa로 형변환한 값이 int bb
		System.out.println(bb);//bb의 값 출력
		char cc = (char) bb;// int bb를 char bb로 형변환한 값이 char cc
		System.out.println(cc);// cc의 값 출력
		
		byte kk = 127;//byte kk는 127
		System.out.println(kk+1);		// 128값을 출력
		System.out.println((byte)(kk+1));	// (byte)128은 오버플로우가 일어난다.
	}
}
