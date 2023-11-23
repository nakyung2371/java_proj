package lab.chap04;

import java.util.Scanner;

public class If_Statement2 {

	public static void main(String[] args) {
		/*
		  
		  if ~ else if, 	==
		  스캐너로 정수 값을 입력받으세요. 자신이 가진 자산을 입력받습니다.
		  
		  0 ~ 1000만원: "버스나 지하철을 타고 다닙니다."
		  1000만원 ~ 10000: "택시를 타고 다닙니다."
		  10000~		 : "비행기를 타고 다닙니다."
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자산을 입력하세요: ");
		int money = sc.nextInt();
		
		if (0 <= money && money < 1000) {
			System.out.println("버스나 지하철을 타고 다닙니다.");
		} else if (1000 <= money && money < 10000) {
			System.out.println("택시를 타고 다닙니다.");
		} else if (10000 <= money) {
			System.out.println("비행기를 타고 다닙니다.");
		} else {
			System.out.println("잘못된 값을 입력했습니다. 양수를 입력하세요.");
		}
		
				
		
		
	}

}
