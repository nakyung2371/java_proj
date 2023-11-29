package lab.chap06;

class Animal {
	
	//1. 필드
	String aName;
	String aColor;
	int aLeg;			//다리 갯수
	int aSpeed;
	String aCry;
	
	//생성자: 필드의 기본 값을 입력하는 생성자
	Animal (String aName, String aColor, int aLeg, int aSpeed, String aCry) {
		this.aName = aName;
		this.aColor = aColor;
		this.aLeg = aLeg;
		this.aSpeed = aSpeed;
		this.aCry = aCry;
	}
	
	//메소드: 필드의 모든 값을 출력하는 메소드
	void printAll (){
		System.out.println("동물의 이름: " + aName);
		System.out.println("동물의 색깔: " + aColor);
		System.out.println("동물의 다리 갯수: " + aLeg);
		System.out.println("동물의 속도: " + aSpeed);
		System.out.println("동물의 울음 소리: " + aCry);
	}
	
	//메소드: int abc() {return aLeg + aSpeed;}
	int abc() {
		int hap = aLeg + aSpeed;
		return hap;
	}
	
}
public class Object_Definition {

	public static void main(String[] args) {
		//객체 생성 및 테스트
		
		//호랑이, 독수리, 사자, 개
		System.out.println("========== 호랑이 ==========");
		Animal a1 = new Animal("호랑이", "검정 갈색 얼룩", 4, 80, "어흥");
		a1.printAll();
		System.out.println("=== 호랑이 다리와 속도의 합 ===");
		System.out.println(a1.abc());
		
		System.out.println("========== 독수리 ==========");		
		Animal a2 = new Animal("독수리", "검정", 2, 100, "독수리가 어케우노 히약");
		a2.printAll();
		System.out.println("=== 독수리 다리와 속도의 합 ===");
		System.out.println(a2.abc());
		
		System.out.println("========== 사자 ==========");
		Animal a3 = new Animal("사자", "갈색", 4, 80, "어흐응");
		a3.printAll();
		System.out.println("=== 사자 다리와 속도의 합 ===");
		System.out.println(a3.abc());
		
		System.out.println("========== 개 ==========");		
		Animal a4 = new Animal("개", "흰색", 4, 50, "멍멍");
		a4.printAll();
		System.out.println("=== 개 다리와 속도의 합 ===");
		System.out.println(a4.abc());
	}

}
