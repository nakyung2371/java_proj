package lab.chap10;

public class Dog extends Animal{		//Animal을 상속
	
	int dog;
	
	void dog () {
		System.out.println("모든 강아지는 귀엽다.");
	}
	
	@Override
		void cry() {
			System.out.println("강아지는 엉엉하고 웁니다.");
		}
	

}
