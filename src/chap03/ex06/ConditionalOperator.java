package chap03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		//삼항 연산자: if ~ else의 축약 구문
		
		//		(참 or 거짓)? 참일 때 실행: 거짓일 때 실행;
		
		//삼항 연산자를 사용
		int val1 = (3 > 5)? 6 : 9;		//1라인으로 처리
		
		System.out.println(val1);
		
		//if
		int val2 ;
		if(true) {
			val2 = 6;	//(조건): true일 때 
		} else {
			val2 = 9;	//(조건): false일 때
		}
		
		System.out.println(val2);
		
		
		
		
	}

}
