package lab.chap10;

public class Inheritance_Test {

	public static void main(String[] args) {
		/*상속 설정 후 필드와 메소드 생성
		  Animal
		  		Tiger
		  			TigerChild
		  		Lion
		  		Dog
		  		
		  UpCasting <-> DownCasting
		*/
		
		
		Animal a1 = new Animal();
		a1.color = "노랑";
		
		Tiger t1 = new Tiger();
		
		Dog d1 = new Dog();
		d1.color = "흰색";
		
		Animal a2 = new Lion();
		Lion l2 = (Lion) a2;
		l2.lion = 1;
		
		
		//UpCasting
		
		//Animal
		Animal a01 = new TigerChild();
		//Tiger
		Tiger t01 = (Tiger) a01;
		t01.tiger = 1;
		//TigerChild
		TigerChild tc01 = (TigerChild) t01;
		tc01.tigerChild = 6;
		
		
		//DownCasting
		
		//Tiger
		Tiger t02 = (Tiger) tc01;
		t02.tiger = 6;
		//Animal
		Animal a02 = (Animal) t02;
		a02.eat();
		
		Animal a3 = new Dog();
		a3.cry();

	}
}
