package chap05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
			자료형: 변수, 상수, 배열(Array)을 정의할 때 자료형이 정의 되어야 함
				- 기본 자료형: Stack 공간에 변수명, 값이 저장, 값 비교 	==, stack의 값을 비교
					boolean, 정수(byte, short, int, long), 실수(float, double), 문자(char)
					- Stack은 초기값이 할당되지 않아도 됨
						- 초기값 없이 사용하면 오류
					
				- 참조 자료형: Stack(변수, 참조 주소), Heap 공간에 값이 저장, 변수명.equals(): Heap의 값
					String: 참조 자료형, 문자열, <- 객체
					: Heap에는 반드시 초기값이 할당 되어야 함
						-- boolean: false
						-- 정수형: 0
						-- 실수: 0.0
						
					객체, 배열, 인터페이스...
					
					배열(Array): 하나의 배열 변수에 여러 개의 값을 넣을 수 있다.
						- 방번호(index): 0번 방부터 시작
						- 배열을 선언 시 방번호가 선언 되어야 함
						- 배얼 방의 갯수: 배열변수명.length()		<- 배열 방의 갯수를 확인
		 */
		
		//변수: 하나의 값만 넣을 수 있다.
		int a = 10;		//선언 시 값을 할당
		int b;			//선언만
		
		int c;
		c = 20;
		c = 30;
		c = 40;
		
		System.out.println(a);
//		System.out.println(b); 		//오류 발생: 기본 자료형은 초기값이 할당 되지 않으면 오류가 발생
		System.out.println(c);
		
		//배열(Array): 배열 변수 하나에 여러 개의 값을 한꺼번에 넣을 수 있다.
		
		//1. 배열 선언: 
		int[] arr = new int[5];		//index: 0, 1, 2, 3, 4
			//자료형[] 배열 변수 = new 자료형[방의 갯수];
				//new: 배열의 값을 Heap에 저장,
				//int[5]: 를 생성
		
		System.out.println("========== 배열 방의 값을 출력 ==========");
		//2. 배열의 각 방의 값을 출력
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[0]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[1]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[2]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[3]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[4]);
		
		//3. 배열 각 방에 값을 입력
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
//		arr[5] = 60;		//실행 시 오류 발생: 런타임 오류(실행 시 오류 발생)
							//ArrayIndexOutOfBoundsException: 배열의 방번호를 넘긴 값을 넣을 때 출력 시 오류 발생
		
		System.out.println("======= 배열 방의 값을 수정 후 출력 =======");
		//4. 배열의 각 방의 값을 출력(값을 수정 후 출력)
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[0]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[1]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[2]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[3]);
		System.out.println("arr 배열의 0번째 방의 값을 출력: " + arr[4]);
		

	}

}
