package lab.chap05;

import java.util.Arrays;

public class Ractacgle_Array2 {

	public static void main(String[] args) {
		/*
		   arr: 배열 변수명, 2차원 배열, [5][10], 행은 5행, 10열
		   		arr[0]: 짝수만 저장
		   		arr[1]: 홀수만 저장, 3의 배수는 빼고 저장
		   		arr[2]: 4, 5의 배수를 저장
		   		arr[3]: 10의 배수 저장
		   		arr[4]: 8단을 입력
		   		
		   		for문으로 출력
		   		Enhanced for문
		   		Arrays.toString()으로 출력
		 */
		
		
		int[][] arr = new int[5][10];
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				for (int j = 0, a = 2; j < arr[i].length; j++) {
					arr[i][j] = a;
					a+=2;
				}
			} else if (i == 1) {
				for (int j = 0, a = 1; j < arr[i].length; a++) {
					if (a % 2 != 0) {		//홀수일 때
						if (a % 3 != 0) {	//3의 배수가 아닐 때
							arr[i][j] = a;
							j++;
						}
					} 
				} 
//			} else if (i == 1) {
//				for (int j = 0, a = 1; j < arr[i].length; a+=2) {
//					if (a % 3 == 0) {
//						continue;
//					} 
//					arr[i][j] = a;
//					j++;
//				} 
			} else if (i == 2) {
				for (int j = 0, a = 1; j < arr[i].length; a++) {
					if ( a % 4 == 0 || a % 5 == 0) {
					arr[i][j] = a;
					j++;
					}
				}
			} else if (i == 3) {
				for (int j = 0, a = 10; j < arr[i].length; j++) {
					arr[i][j] = a;
					a+=10;
				}
			} else if (i == 4) {
				for (int j = 0, a = 1; j < arr[i].length; j++) {
					arr[i][j] = a * 8;
					a++;
				}
			}
		}
		
		System.out.println("==== for문으로 출력 ====");
		//for문으로 출력
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("==== Enhanced for문으로 출력1 ====");
		for (int[] a: arr) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("==== Enhanced for문으로 출력2 ====");
		//Enhanced for문 출력
		for (int[] a: arr) {
			for (int b : a) {
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("==== Arrays.toString()으로 출력 ====");
		//Arrays.toString()으로 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));	
		}
		
	}

}
