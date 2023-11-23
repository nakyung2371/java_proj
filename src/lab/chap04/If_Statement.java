package lab.chap04;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {

		/*
		  if ~ else if, .equals("월요일")
		  
		  콘솔에서 "월요일"이 입력되었을 때 출력 "월요일은 자바를 공부합니다."
		  콘솔에서 "화요일"이 입력되었을 때 출력 "화요일은 데이터베이스를 공부합니다."
		  콘솔에서 "수요일"이 입력되었을 때 출력 "수요일은 html javascript를 공부합니다."
		  콘솔에서 "목요일"이 입력되었을 때 출력 "목요일은 JSP를 공부합니다."
		  콘솔에서 "금요일"이 입력되었을 때 출력 "금요일은 Spring을 공부합니다."
		  콘솔에서 "토요일"이 입력되었을 때 출력 "토요일은 운동을 합니다."
		  콘솔에서 "일요일"이 입력되었을 때 출력 "일요일은 TV를 시청합니다."
		  콘솔에서 그 외의 값이 입력되었을 때 출력 "잘못 입력했습니다. 요일을 입력하세요"
		 
		 */

		Scanner sc = new Scanner(System.in);
	
		System.out.println("요일을 입력하세요: ");
		String day = sc.next();
		
		if (day.equals("월요일")) {
			System.out.println(day + "은 자바를 공부합니다.");
		} else if (day.equals("화요일")){
			System.out.println(day + "은 데이터베이스를 공부합니다.");
		} else if (day.equals("수요일")){
			System.out.println(day + "은 html javascript를 공부합니다.");
		} else if (day.equals("목요일")){
			System.out.println(day + "은 JSP를 공부합니다.");
		} else if (day.equals("금요일")){
			System.out.println(day + "은 Spring을 공부합니다.");
		} else if (day.equals("토요일")){
			System.out.println(day + "은 운동을 합니다.");
		} else if (day.equals("일요일")){
			System.out.println(day + "은 TV를 시청합니다.");
		} else {
			System.out.println("잘못 입력했습니다. 요일을 입력하세요.");
		}
	}

}
