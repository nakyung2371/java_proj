package lab.chap05;

import java.util.Scanner;

public class Array_Definition3 {

	public static void main(String[] args) {
		/*
		   1. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 7의 배수와 8의 배수를 저장 후 출력
		   2. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 1씩 증가하는데 4의 배수는 빼고 저장 후 출력
		   3. 스캐너로 인풋 값을 받아서 배열의 방의 크기를 지정하고 3의 배수는 저장하고 6의 배수는 빼고 저장 후 출력
		 */
		
		//배열, 제어문(for, do ~ while, 연산자(||, !=, ==(같다))
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=========================");
			System.out.println("1. 7의 배수와 8의 배수를 저장 후 출력");
			System.out.println("2. 1씩 증가하며 4의 배수를 빼고 저장 후 출력");
			System.out.println("3. 3의 배수를 저장하고 6의 배수를 빼고 저장 후 출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("=========================");
			System.out.println("정수 값을 입력하세요: ");
			
			int selectNum = sc.nextInt();
			
			if (selectNum == 1) {
				System.out.println("=========================");
				System.out.println("배열의 방의 크기를 지정하세요: ");
				int idx = sc.nextInt(); 
				int[] arr = new int[idx];
				
				System.out.println("1. 7의 배수와 8의 배수를 저장 후 출력");
				System.out.println("=========================");
				int a = 1;
				
				for(int i = 0; ; a++) {
					
					if (i == idx) { break; }
					if (a % 7 == 0 || a % 8 == 0) {
						arr[i] = a;
						i++;		//7의 배수나 8의 배수의 값이 등록 되었을 때 방번호 증가
					}
				}
				for(int i = 0; i < arr.length; i++) 
					System.out.println("방번호: " + i + ", 방의 값: " + arr[i]);

			} else if (selectNum == 2) {
				System.out.println("=========================");
				System.out.println("배열의 방의 크기를 지정하세요: ");
				int idx = sc.nextInt(); 
				int[] arr = new int[idx];
				
				System.out.println("2. 1씩 증가하며 4의 배수를 빼고 저장 후 출력");
				System.out.println("=========================");
				int a = 1;
				
				for(int i = 0; i < arr.length; a++) {
					if (a % 4 == 0) { 	//a 변수의 값이 4의 배수일 때는 아래 내용을 실행하지 않는다
						continue;
					}
					arr[i] = a;
					i++;

				}
				//각 방의 내용을 for문을 사용해서 출력
				for(int i = 0; i < arr.length; i++) {
					System.out.println("방번호: " + i + ", 방의 값: " + arr[i]);
				}
			} else if (selectNum == 3) {
				System.out.println("=========================");
				System.out.println("배열의 방의 크기를 지정하세요: ");
				int idx = sc.nextInt(); 
				int[] arr = new int[idx];
				
				//배열의 각 방에 값을 넣음 for
				int a = 1;
				for(int i = 0; i < arr.length; a++) { 	//i: 방번호는 값이 들어갔을 때만 방번호가 늘어야 한다.
					
					if ( a % 3 == 0) { 	//a의 값이 3의 배수		<- 3, 6의 배수
						if ( a % 6 != 0 ) {		//6의 배수가 아닐 때 true
							//3의 배수이면서 6의 배수가 아닌 것이 실행
							arr[i] = a;
							i++;
						}
					}
				}
				
				//배열의 각 방에 값을 출력하는 for
				for(int i = 0; i < arr.length; i++) {
					System.out.println("방번호: " + i + ", 방의 값: " + arr[i]);
				}
				
			} else if (selectNum == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			}
			
		} while(true);
		System.out.println("도달할 수 없는 코드 ----");
		
		sc.close();
	}
}


