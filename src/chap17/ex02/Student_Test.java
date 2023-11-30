package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) {
		//1. Student 객체 생성
		
		Student s1 = new Student();		//기본 생성자 호출
		Student s2 = new Student("홍길동");
		Student s3 = new Student(1111);
		Student s4 = new Student("김길동", "서울");
		Student s5 = new Student("최길동", "서울", 1111);

		//2. 객체를 ArrayList<Student>에 저장		<- 배열
			//<타입>: 제너릭 타입, 객체형 타입이 적용되어야 함
					//Boolean, Byte, Short, Integer, Long, Float, Double, Charter
		
		List<Student> aList = new ArrayList<> ();
		
		//aList에 Student 객체 저장
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);


		int[] arr = new int[] {1, 2, 1, 3, 3, 3, 4, 5, 5};
		
		//1. Method(클래스, 타입) -> 객체 생성
		Method m = new Method();
		
		m.arrayListOut(aList);
		
		System.out.println("=========================");
		m.arrayOutput(arr, 3);
		
		System.out.println("=========================");
		m.nameAddr(aList);
		
		aList.add(new Student("이순신", 55, 66, 77));
		aList.add(new Student("김순신", 54, 64, 74));
		aList.add(new Student("홍순신", 53, 63, 73));
		
		m.all(aList);
		
		System.out.println("=========================");
		m.sMethod(new Student("박순신", 77, 55, 90));
	}

}
