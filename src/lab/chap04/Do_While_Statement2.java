package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a; 		//스캐너로 인풋받는 변수
		
		do {
			System.out.println("=========================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의 배수 출력 ||");
			System.out.println("4. 프로그램 종료");
			System.out.println("=========================================================");
			System.out.println("위 내용을 정수로 입력하세요.");
			a = sc.nextInt();
			
			if (a == 1) {
				System.out.println("1. 구구단 출력");
				//구구단 출력 프로그램
				for (int i = 1; i < 10; i++) {
				System.out.println("------------" + i + "단------------");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}
			} else if (a == 2) {
				System.out.println("2. 19단 출력");
				//19단 출력 프로그램 작성
				for (int i = 1; i < 20; i++) {
					System.out.println("------------" + i + "단------------");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d * %d = %d\t", i, j, i * j);
					}
					System.out.println();
				}				
			} else if (a == 3) {
				System.out.println("3. 1 ~ 1000까지 3의 배수 출력");
				
				//for문
//				for (int i = 1; i < 1000; i++) {
//					if (i % 3 == 0) {
//						System.out.println(i);
//					}
//				}
				
				//while문
//				int i = 1;
//				while(i <= 1000) {
//					if (i % 3 == 0) {
//						System.out.println(i);
//					}
//					i++;
//				}
				
				//do while문
				
				int i = 1;
				do {
					if (i % 3 == 0) {
						System.out.println(i);
					}
					i++;
				} while (i <= 1000);
				
				
			} else if (a == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			}
		} while(true);
				
		sc.close();		//메모리에서 스캐너를 제거
	}

}
