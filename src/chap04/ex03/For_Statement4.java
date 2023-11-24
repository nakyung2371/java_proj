package chap04.ex03;

public class For_Statement4 {

	public static void main(String[] args) {
		//이중 for문: for문 내 for문
		
		for (int i = 0; i < 10; i++) {
			System.out.println("바깥쪽 for문: " + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("i 변수: " + i + " j 변수: " + j);
				
			}
			
			System.out.println("===========================");
		}
		
		System.out.println("===============================================");
		
		
		//2중 for문을 사용해서 구구단 출력
		
		System.out.println("==============구구단 출력==============");
		for (int i = 1; i <= 9; i ++) {
			System.out.println("-------------" + i + "단 출력-------------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("==============구구단 출력(단을 옆으로 출력)==============");
		for (int i = 1; i <= 9; i ++) {		//1단
			System.out.println();
//			System.out.println("-------------" + i + "단 출력-------------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf(i + " * " + j + " = " + i * j  + "\t");	//j는 각 단의 1~9까지 곱하는 수
				
			}
		}
	}

}
