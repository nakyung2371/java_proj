package chap10.ex01;

public class Inheritance01 {

	public static void main(String[] args) {
		/*
		   상속(Inheritance): OOP(객체지향프로그래밍)의 특징
		   		- 자바는 하나의 부모 클래스만 상속할 수 있다.
		   		- 중복을 방지할 수 있다.
		   		- OOP의 꽃
		   		- 부모 클래스의 필드, 메소드, 이너 클래스가 그대로 자식 클래스에게 상속된다.
		   				<- 생성자는 상속되지 않는다.
		   		- 자식 클래스를 생성하면 자식 클래스 생성자 내부에 super()가 생략 되어 있다.
		   			super() - 부모 클래스의 생성자를 호출
		   		- 자식 클래스를 생성하면 부모 클래스가 먼저 만들어지고 자식 클래스가 생성
		   		- 자식 클래스명 extends 부모 클래스명
		 */
		
		//1. Student 객체 생성:
		Student s1 = new Student();
		
		//부모 클래스에서 정의한 필드와 메소드
		s1.name = "홍길동";
		s1.age = 30;
		
		s1.eat();		//모든 사람은 먹는다.
		s1.sleep();		//모든 사람은 잠을 잔다.
		
		//Student 클래스의 필드와 메소드
		s1.studentID = 1111;
		s1.goToSchool();	//모든 학생은 학교를 갑니다.
		s1.stuInfo();
		
		//2. Professor
		Professor p1 = new Professor();
	
		//부모의 필드와 메소드
		p1.name = "김교수";
		p1.age = 50;
		
		p1.eat();
		p1.sleep();
		
		//자식의 필드와 메소드
		p1.professorID = 2222;
		p1.teach();
		
		//3. Worker
		Worker w1 = new Worker();
		
		w1.name ="김회사원";
		w1.age = 33;
		
		w1.eat();
		w1.sleep();
		
		w1.workerID = 3333;
		w1.goToWork();
		
		System.out.println("==== super vs super() ====");
		//this 키워드		: 자기 자신의 객체, 	this.필드		this.메소드
		//this() 메소드	: 생성자 실행 블락에서 사용됨. 반드시 첫 라인에 와야함.
							//다른 생성자를 호출 
		
		//super 키워드	: 부모의 필드 메소드 호출, super.필드명, super.메소드명
		//super() 메소드	: 생성자 실행 블락에서만 사용됨. 반드시 첫 라인에 와야함
							//부모 클래스의 생성자를 호출
							//자식 클래스 생성자 내부에는 실행 블락 첫 라인에 super()가 생략되어 있다.
							//자식 클래스를 생성하면 super()에 의해서 부모 클래스가 먼저 만들어진다.
		
		Student s2 = new Student();		//기본 생성자 호출
		
		System.out.println("========================");
		//Student 클래스의 input이 1개인 생성자 호출
		Student s3 = new Student(9999);
		//1. Student(9999) 생성자 호출 -> 2. Human, super("김똘똘", 20); 호출
		//3. Object가 생성 -> Human 생성 -> Student 생성
		
		System.out.println("========================");
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		System.out.println(s3.stuName);
		System.out.println(s3.studentID);
		
		System.out.println("========================");
		
		//Type Casting:
		/*
		   UpCasting: 자동 적용될 수 있다. 자식 타입 -> 부모 타입
		   		부모의 필드와 메소드만 사용 가능
		   DownCasting: 부모 -> 자식, 명시가 필요
		   		부모, 자식의 필드와 메소드를 모두 사용 가능
		 */
		
		//자식 객체를 생성해서 부모 타입으로 지정함: 부모의 필드와 메소드만 사용 가능
		//호출: 1. Child 호출 -> 2. Professor 호출 -> 3. Human 호출
		//생성: 4. Human 생성 -> 5. Professor 생성 -> 6. Child 생성
		//Type: Human <- Human의 필드와 메소드만 사용 가능함
		
		Human ch01 = new Child();	//ch01: Human, Professor, Child를 내포하고 있고, 
		
		//Human의 필드와 메소드만 사용 가능
		ch01.name = "홍길동";
		ch01.eat();
		
		//DownCasting: Human, Professor의 필드와 메소드를 사용 가능
		Professor pp1 = (Professor) ch01;
		
		//Human
		pp1.age = 10;
		
		//Professor
		pp1.professorID = 30;

		//DownCasting: Child: Human, Professor, Child
		Child ch05 = (Child) pp1;
		
		//Human
		ch05.name = "이순신";
		//Professor
		ch05.professorID = 333;
		//Child
		ch05.childName = "아기";
		ch05.childMethod();
		
		//UpCasting: 명시를 하지 않더라도 자동으로 작동됨
		//h01: Human
		Human h01 = ch05;
		
		//Human 클래스를 객체화해서 Human 타입: Human
		//hh01: Human
		Human hh01 = new Human();
		
		//Human
		hh01.age = 40;
		
//		Professor pp02 = (Professor) hh01;	//실행 시 오류
		
		
		//Professor를 객체화해서 Human 타입으로 지정
		Human ppp01 = new Professor();
		
		//Human
		ppp01.name = "김길동";
		
		//DownCasting: Human -> Professor
		Professor ppp02 = (Professor) ppp01;
		
		//Human
		ppp02.name = "김";
		//
		ppp02.professorID = 1234;
		
//		Child ch33 = (Child) ppp02;		//실행 시 오류 발생
		Child ch44 = (ppp02 instanceof Child) ? (Child) ppp02 : null;
		
		//객체 instanceof 타입: 객체에 타입이 존재하면 True
		System.out.println(ch44);
		
		//Child를 객체화해서 Child 타입으로 지정: 자신과 부모의 모든 필드와 메소드를 사용할 수 있다.
		//Human, Professor, Child
		
		Child ch001 = new Child();
		
		ch001.name = "김";
		ch001.professorID = 123;
		ch001.childName = "손자";
		
		//UpCasting Child -> Professor -> Human
		Professor p001 = ch001;
		Human h001 = p001;

		//DownCasting Human -> Professor -> Child
		Professor p002 = (Professor) p001;
		Child c002 = (Child) p002;
		
//		Human h0001 = new Child();
//		Professor p0001 = (Professor) h0001;
//		Child c0001 = (Child) p0001;
	}

}
