package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {
		/*
		  1000부터 1까지 5씩 감소하면서 출력: for문, while문으로 출력
		 */
		
		//for문
		System.out.println("=============for문=============");
		for (int i = 1000; i >= 1; i -= 5) {
			System.out.println(i);
		}
		
		
		//while문
		System.out.println("=============while문=============");
		int a = 1000;
		while (a >= 1) {
			System.out.println(a);
			
			a -= 5;
		}
	}

}
