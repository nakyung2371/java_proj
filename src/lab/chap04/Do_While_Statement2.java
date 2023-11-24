package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a; 		//스캐너로 인풋받는 변수
		
		do {
			System.out.println("=========================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~ 1000까지 3의 배수 출력 ||");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
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
				
				//while문1
//				int i = 1;
//				while(i <= 1000) {
//					if (i % 3 == 0) {
//						System.out.println(i);
//					}
//					i++;
//				}
				
				//while문2
//				int b = 0;
//				while (b < 1000) {
//					b += 3;
//					System.out.println(b);
//				}
				
				//do while문1
//				int i = 1;
//				do {
//					if (i % 3 == 0) {
//						System.out.println(i);
//					}
//					i++;
//				} while (i <= 1000);
				
				//do while문2
				boolean c = true;
				int d = 1;
				do {
					if (d % 3 == 0) {
						System.out.println(d);
					}  if (d == 1000) 
						c = false;
						d++;
					} while (c);
				
			
			} else if (a == 4) {
//				System.out.println("10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
//				int num = 1;
//				int sum = 0;
//				int num1 = 0;
//				
//				do {
//					System.out.println(num + "번째 정수를 입력하세요: ");
//					num1 = sc.nextInt();
//					num++;
//					if (num1 % 2 == 0) {
//						sum++;
//					}
//				} while (num <= 10);
//					System.out.println("짝수의 갯수는 " + sum + "개입니다.");
				int c, count = 0;					//c: 스캐너로 정수를 받는 변수, count: 짝수를 카운트 하는 변수
				for (int i = 1; i <= 10; i++) {
					c = sc.nextInt();				//10번 루프: input값을 할당받음
					if (c <= 0) {					//0 이거나 음수는 카운트 하지 않음
						continue;
					}
					if ( c % 2 == 0) {				//짝수만 카운트 변수에 할당 한다
						count++;
					}
					
				}
				System.out.println("입력한 10개의 정수 중 짝수는: " + count + "개 입니다.");
					
							
			
				
			} else if (a == 5) {
				System.out.println("4. 프로그램 종료");
				break;
			}
		} while(true);
				
		sc.close();		//메모리에서 스캐너를 제거
	}

}
