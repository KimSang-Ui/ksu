package chapter04;
class FlowEx30 {
	public static void main(String[] args) { 
		int sum = 0;
		int i   = 0;
		
		while(true) {
			
			if(sum > 100)
				break;
			++i;
			sum = sum + i;
			
			System.out.println("i=" + i);
			System.out.println("sum=" + sum);
			
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}   
}