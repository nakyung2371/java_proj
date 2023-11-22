package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {
		//다양한 진법 표현, 비트 연산자
		
		//1. 다양한 진법 표현: 2진수, 10진수, 8진수, 16진수, calc(계산기)
		
		int data = 13;
		
		//정수를 2진수로 변환: Integer.toBinaryString(정수); -> 2진수로 출력
		System.out.println(Integer.toBinaryString(data));	//1101
		
		//정수를 16진수로 변환: Integer.toHexString(정수); -> 16진수로 출력
		System.out.println(Integer.toHexString(data));	 	//d
		
		//정수를 8진수로 변환: Integer.toOctalString(정수); -> 8진수로 출력
		System.out.println(Integer.toOctalString(data)); 	//15
		
		//문자열로 된 숫자를 정수 타입으로 변환 *중요, 많이 사용함*
		System.out.println("3" + "5"); 			//문자열 + 문자열 = 문자열 연결
		
		//Integer.parseInt("숫자 정수"); -> 정수 타입으로 저장됨		*많이 사용*
		System.out.println(Integer.parseInt("3") + Integer.parseInt("5"));		//8
		
		//문자열로 된 실수를 실수 타입으로 변환
		System.out.println("13.5" + "17.77");	//13.517.77
		
		//Double.perseDouble("숫자 실수"); -> 실수 타입으로 저장됨
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77"));
		
		System.out.println("===============================================");
		//스캐너에서 숫자가 문자열로 들어왔을 때 정수로 변환, 실수로 변환 후 연산
		
		Scanner sc = new Scanner(System.in);	//ctrl + shift + o
		
		String kor;
		String eng;
		String avg;
		
		System.out.println("국어점수(정수) 영어점수(정수) 평균(실수)로 입력해주세요");
		
		kor = sc.next();
		eng = sc.next();
		avg = sc.next();
		
//		int hap = kor + eng;		//오류 발생, 타입이 맞지 않는다.
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng);
		
		System.out.println("국어점수 + 영어점수: " + hap);
		System.out.println("평균: " + Double.parseDouble(avg));
		
		
	}

}
