package lab.chap05;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) {
		/*
		  //1. 선언
		   	arr[3][10]: 행의 방번호: 0 ~ 2, 방의 갯수: 3, arr.length
		   				열의 방번호: 0 ~ 9
		   	
		  //2. 배열 방에 값을 저장
		   		<2중 for문을 사용해서 값을 저장>
		   					0번 행에는 1부터 시작해서 1씩 증가
		   					1번 행에는 3의 배수를 저장
		   					2번 행에는 7의 배수, 8의 배수 저장
		   		
		   //3. 출력
		   		2중 for문을 사용해서 출력
		   		Enhanced for문을 사용해서 출력
		   		Arrays.toString()으로 출력, <- 1차원 배열을 출력
		 */
		
		//1. 선언
		int[][] arr = new int[3][10];
		
//		System.out.println(arr.length);			//행의 갯수
//		System.out.println(arr[0].length);		//열의 갯수
		
		//2. 배열 방에 값을 저장 - 2중 for문을 사용해서 값을 저장
		System.out.println("=== 2. 값을 입력 ===");
		for (int i = 0; i < arr.length; i++) {			//행을 반복: i <= 행의 방번호
//			System.out.println("행의 방번호: " + i);
				
				if (i == 0) {			//배열의 각방에 :1씩 증가
					for (int j = 0, a = 1; j < arr[i].length; j++) {	//열을 반복: j <= 열의 방번호
						arr[i][j] = a;
						a++;
					}
				} else if (i == 1) {	//각 방에 3의 배수 저장
					for (int j = 0, a = 3; j < arr[i].length; j++) {	//열을 반복: j <= 열의 방번호																																																																																																																																																																																																																																																																																																																																																																																																																																																																										; j < arr[i].length; j++) {	//열을 반복: j <= 열의 방번호
						arr[i][j] = a;
						a += 3;
					}
				} else if (i == 2) {	//7과 8의 배수 저장
					for (int j = 0, a = 1; j < arr[i].length; a++) {	//열을 반복: j <= 열의 방번호
					if (a % 7 == 0 || a % 8 == 0) {						//7의 배수, 8의 배수
						arr[i][j] = a;
						j++;
					}
				}
			}
		}
		
		System.out.println("=== Enhanced for문을 사용해서 출력 ===");
		for (int[] a: arr) {
			for (int b : a) {
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("=== Arrays.toString()으로 출력 ===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	
	}
}
