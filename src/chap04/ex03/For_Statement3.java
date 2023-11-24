package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {
		//무한 루프에서 break;를 사용해서 무한 루프 빠져 나오기
			//반복문에서 특정 시점에 break; if문 내에 break를 사용함. <- for, while, do while
		
		//for문에서 break;
		
		for (int i = 0; i >= 0; i += 10) {		//i = i + 10     <->    i += 10
			
			System.out.println(i);
			
			if (i == 10000) {		//조건을 주어서 무한 루프를 빠져나옴
				break;
			}
		}
		
		System.out.println("=====================================");
		for (int i = 0; i >= 0; i += 10) {		//i = i + 10     <->    i += 10
			
			System.out.println(i);
			if (i == 10000) { 		//중괄호 생략 가능
				break;
			}
			System.out.println("오늘");
			
		}
	}

}
