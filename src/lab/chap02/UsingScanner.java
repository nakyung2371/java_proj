package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//sc를 사용함
		//스캐너로 각 변수의 값을 인풋받아서
		
		String stu;	//학생
		
		int kor;		//국어 점수
		int eng;		//영어 점수
		int math;		//수학 점수
		
		int hap;		//점수의 합계
		double avg;		//평균

		System.out.println("첫번째 학생================================");
		System.out.println("학생 1의 이름 국어점수 영어점수 수학점수를 입력하세요: ");
		//코드 부분

		stu = sc.next();		//콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0;
		
		System.out.println(stu + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg + "점입니다.");	//출력 결과
		System.out.println("========================================");
		
		System.out.println("두번째 학생================================");
		System.out.println("학생 2의 이름 국어점수 영어점수 수학점수를 입력하세요: ");
		
		stu = sc.next();		//콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0;
		
		System.out.println(stu + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg + "점입니다.");
		System.out.println("========================================");
		
		System.out.println("세번째 학생================================");	
		System.out.println("학생 2의 이름 국어점수 영어점수 수학점수를 입력하세요: ");
		
		stu = sc.next();		//콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0;
		
		System.out.println(stu + "의 모든 점수의 합계는 " + hap + "점이고 평균은 " + avg + "점입니다.");
	}

}
