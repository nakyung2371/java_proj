package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {
		/*
		 	클래스명: 반드시 첫자는 영문 대문자
		 	변수명: 소문자로 시작(권장사항), 낙타 형식으로 이름을 사용
		 	상수명: 대문자로 시작(권장사항)
		 	
		 		특수문자: _, &만 사용 가능
		 		숫자가 첫자에 올 경우 오류 발생, 숫자 사용 가능
		 */
		
		/*
		 	제어문: 프로그램의 순서를 바꾸어서 처리:
		 		if문: break;가 내장
		 		switch문: break; 블락을 빠져 나올 때 사용
		 		
		 	if -- 3가지 구문
		 	
		 	1. 조건이 1개일 때				삼항 연산자로 수정 (조건)? 참:거짓;
		 	
		 	   if(조건) {
		 		조건이 true일 때 실행문;			
		 	   } else {
		 	   	조건이 false일 때 실행문;
		 	   }
		 		
		 	2. 조건이 여러 개일 떼
		 	   
		 	   if (조건1) {
		 	   	조건이 1일 때;
		 	   } else if (조건2) {
		 	    조건이 2일 때;
		 	   } else if (조건3) {
		 	    조건이 3일 때;
		 	   } else if (조건4) {
		 	    조건이 4일 때;
		 	   } else {
		 	    위의 모든 조건이 만족되지 않을 때 작동
		 	   }
		 	   
		 	 3. 한 라인으로 사용
		 	 	if (조건) {조건이 true일 때} 
		 	 	if (조건) 조건이 true일 때;
		 */

		//조건이 1개일 때: if ~ else
		int a = 10;
		
		if (a < 30) {
			System.out.println("참입니다.");		//조건이 참이면 실행

		} else {
			System.out.println("거짓입니다.");		//조건이 거짓이면 실행
		}
		
		System.out.println("프로그램 종료입니다.");
		
		//조건이 여러 개일때, 점수가 90점 이상일 때: A학점, 80점 이상일 때: B학점, 70점 이상일 때: C
		
		System.out.println("=====================================");
		
		int score = 55;
		
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else if (score >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		System.out.println("프로그램 종료입니다.");
		
		
		System.out.println("==========if 조건에서 조건 처리==========");
		
		score = 90;
		
		if (score >= 60 && score < 70) {			//true && false == false
			System.out.println("D학점입니다.");
		} else if (score >= 70 && score < 80) {		//true && false == false
			System.out.println("C학점입니다.");
		} else if (score >= 80 && score < 90) {		//true && false == false
			System.out.println("B학점입니다.");
		} else if (score >= 90 && score <= 100) {	//true && true == true
			System.out.println("A학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		System.out.println("프로그램 종료입니다.");		
		
		
		System.out.println("=====================================");
		
		//조건이 true일 때만 실행: 중괄호 생략 가능
		if (10 > 5) {System.out.println("참입니다."); }
		if (10 > 5) System.out.println("10은 5보다 큽니다."); 
		
		
		
	}

}
