package ex03;

/*
 * int -> char unicode A =>65 65=>A
 * 
 * 실수 -> 정수
 * double -> int 소수점을 버려서 형변환됩니다.
 * 
 *  정수 -> 실수
 *  10 -> 10.0
 *  20 -> 20.0
 */
public class Ex09 {

	public static void main(String[] args) {
		double d = 833.833d;// double d = 833.833d다
		int score = (int) d;// double의 값을 int의 값으로 형변환
		System.out.println("score = "+score); //score를 출력 833
		System.out.println("d = "+d);// d를 출력 833.833d 출력
		
		// 비트 체계가 작은거에서 큰걸로 바꿀때는 자료의 소실이 
		// 없기 때문에 안적어도 자동 형변환 됩니다.
		int aa = 10;// int aa는 10이다
		double ee = aa;//double ee는 10이다.
		System.out.println("aa = "+ aa);//aa를 출력, 10출력
		System.out.println("ee = "+ ee);//ee를 출력, 10.0출력
	}
}
