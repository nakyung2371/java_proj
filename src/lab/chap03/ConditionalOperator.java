package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너 장착, 정수, % 나머지		|| 연산자 사용, 삼항 연산자 사용.
		
		//1. 스캐너로 정수 값을 인풋 받아서: 출력 내용: 인풋 받은 값은 00이고, 짝수입니다.(홀수입니다)
		System.out.println("정수 값을 입력하세요.: ");
		
		int a = sc.nextInt();
		System.out.printf("인풋 받은 값은 %d이고, ", a);
		System.out.println( ((a % 2) == 0)? "짝수입니다.":"홀수입니다." );
		
		System.out.println("==========================================");
		
		
		//2. 스캐너로 값을 인풋 받아서: 출력 내용: 인풋 받은 값은 00이고, 3, 6, 9의 배수입니다.(3, 6, 9의 배수가 아닙니다.)
		System.out.println("정수 값을 입력하세요.: ");

		int b = sc.nextInt();
		System.out.printf("인풋 받은 값은 %d이고, ", b);
//		System.out.println( ((b % 3) == 0)? "3, 6, 9의 배수입니다.":"3, 6, 9의 배수가 아닙니다." );
		System.out.println( (b % 3 == 0 || b % 6 == 0 || b % 9 == 0 )? "3, 6, 9의 배수입니다.":"3, 6, 9의 배수가 아닙니다." );
		
	
	}

}