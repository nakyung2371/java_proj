package lab.chap04;

import java.util.Scanner;

public class Switch_Statement2 {

	public static void main(String[] args) {
		/*
		   switch ~ case문으로 프로그램을 작성
		   
		   월욜 입력해서 해당 월은 00일입니다.
		   
		   31일 출력되는 달: 1, 3, 5, 7, 8, 10, 12
		   30일 출력되는 달: 4, 6, 9, 11
		   28일 출력되는 날: 2
		   
		   스캐너로 달을 입력받고, 해당 달에 대한 일을 출력한다
		   		출력 내용: "해당 월은 00월이고, 00일까지 존재합니다."
		   
		 */
		
		int month;		//스캐너로 input을 받습니다.
		int day = 30;	//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요: ");
		month = sc.nextInt();
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day += 1;
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n", month, day);
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n", month, day);
			break;
		case 2 :
			day -= 2;
			System.out.printf("해당 월은 %d월이고, %d일까지 존재합니다.\n", month, day);
			break;
		default :
			System.out.println("잘못 입력되었습니다.");
		}
		
		System.err.println("==========================================");
		
	}

}
