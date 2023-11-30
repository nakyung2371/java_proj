package lab.chap17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList {

	public static void main(String[] args) {
		/*
		   배열: arr		: 100번방, 10의 배수만 저장 후 출력	<- for, Arrays.toString()
		   컬렉션: aList	: 20의 배수를 100번방까지만 저장, for문으로 출력
		 */
		
		//배열: 참조 자료형
			//1. 자료형[] 변수 = new 자료형[방갯수];
		int[] arr = new int[100];
		
		//값을 입력
		for(int i = 0, a = 10; i < arr.length; i++) {
			arr[i] = a;
			a += 10;
		}
		
		//for문으로 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		//Enhanced for문으로 출력
		System.out.println();
		System.out.println("===============================");
		for (int k : arr) {
			System.out.print(k + ", ");
		}
		
		//Arrays.toString()으로 출력
		System.out.println();
		System.out.println("===============================");
		System.out.println(Arrays.toString(arr));
		
		
		//컬렉션: ArrayList, 자동으로 방 크기가 늘어나고 줄어든다. 제너릭 타입으로 선언: <Integer>
			//import해서 사용
			//ArrayList 선언
			//메소드를 사용해서 값을 넣고, 삭제, 출력
			//aList.add(값)				//마지막 방에 값을 추가
			//aList.add(index, 값)		//index 방 번호에 값을 넣음
			//aList.size(); 			//방의 갯수
			//aList.remove(index), 		aList.remove(값)		//삭제
			//aList.get(index)			//index의 값을 출력
		
		List<Integer> aList = new ArrayList<> ();
		ArrayList<Integer> aList2 = new ArrayList<> ();
		
		System.out.println(aList.size());
		
		//값을 입력
		for(int i = 0, a = 0; i < 100; i++) {
			a += 20;
			aList.add(a);
		}
		
		System.out.println("컬렉션의 방의 크기: " + aList.size());
		
		//각 방의 내용을 출력
		System.out.println("===============================");
		for(int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i) + ", ");			//i번째 방의 값을 출력
		}
	
		System.out.println();
		System.out.println("===============================");
		System.out.println(aList);

	}

}
