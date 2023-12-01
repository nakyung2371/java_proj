package lab.chap10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) {
		/*
		    1. 자식 객체를 생성 후
		   	 Apple("사과", 30, 5000) Fruit 타입으로 지정
		   	 Banana("바나나", 44, 6000)
		   	 StrawBerry("딸기", 55, 7000)
		   	 
		    2. ArrayList 객체 3개를 저장
		    3. For문으로 ArrayList의 객체를 꺼내서 totalPrice() 호출 시
		    4. 	출력: "000 과일의 전체 가격은: 000입니다."
		   
			자식 객체를 생성하면서 부모 타입으로 지정하면, 배열이나 클래스에 동일한 타입으로 저장
		 */
		
		//1. 자식 객체를 생성하면서 부모 타입으로 지정함 <- 배열, 컬렉션 동일한 타입으로 저장

		Fruit a1 = new Apple("사과", 30, 5000);
		Fruit b1 = new Banana("바나나", 44, 6000);
		Fruit s1 = new Strawberry("딸기", 55, 7000);
		
		Apple a2 = new Apple();
		
		a1.totalPrice();
		b1.totalPrice();
		s1.totalPrice();
		
		System.out.println("==============================");
		List<Fruit> aList = new ArrayList<> ();
		aList.add(a1);
		aList.add(b1);
		aList.add(s1);
		aList.add(a2);		//자식 객체이기 때문에 자동으로 UpCasting 되면서 리스트에 들어간다.
	
		for(int i = 0; i < aList.size(); i++) {
			aList.get(i).totalPrice();
		}
		
		//자바의 꽃: 상속을 사용한 다형성
		//다형성: 상속, 부모의 메소드를 출력 시 자식의 오버라이딩된 메소드를 출력
		
		
	}

}
