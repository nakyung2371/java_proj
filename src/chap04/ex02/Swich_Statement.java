package chap04.ex02;

public class Swich_Statement {

	public static void main(String[] args) {
		/*
		   switch: 기본적으로 case문 내에서 break;
		   		- defalut에서는 break; 없이 빠져나올 수 있다.
		 */
		
		//switch문: break; 넣어서 해당 블락을 빠져 나와야 함
		
		int val1 = 3;
		
		switch (val1) {		//val1: 점프 변수, case에 값으로 점프		<- 정수, 문자(char), 문자열
		case 1 :
			System.out.println("A");
			break;
		case 2 :
			System.out.println("B");
			break;
		case 3 :
			System.out.println("C");
			break;
		case 4 :
			System.out.println("D");
			break;
		default :						//case에 없는 값은 default로 점프
			System.out.println("F");
		}
		
		System.out.println("=================================");
		
		
		//문자: char가 들어간 swich문
		char ch = 'f';
		
		switch (ch) {
		case 'a' :
			System.out.println("A학점");
			break;
		case 'b':
			System.out.println("B학점");
			break;
		case 'c' :
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");	
		}
		
		System.out.println("=================================");
		
		String abc = "월요일";
		
		switch (abc) {
		case "월요일":
			System.out.println("월요일은 자바를 공부합니다.");
			break;
		case "화요일":
			System.out.println("화요일은 데이터 베이스를 공부합니다.");
			break;
		case "수요일":
			System.out.println("수요일은 html을 공부합니다.");
			break;
		case "목요일":
			System.out.println("목요일은 리액트를 공부합니다.");
			break;
		case "금요일":
			System.out.println("금요일은 JSP를 공부합니다.");
			break;
		case "토요일":
			System.out.println("토요일은 운동을 공부합니다.");
			break;
		case "일요일":
			System.out.println("일요일은 TV를 시청합니다.");
			break;
		default :
			System.out.println("잘못된 값을 입력했습니다. 요일을 넣으세요.");
		}
	}

}
