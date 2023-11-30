package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		List<Account> aList = new ArrayList<> ();
		Account a = new Account();
		int select;
		
		out: do {
			System.out.println("=======================================");
			System.out.println("0. 계좌 이름과 계좌 번호 등록");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			System.out.println("=======================================");
			select = sc.nextInt();
			

			switch(select) {
			case 0:
				
				//기존의 계좌가 존재하면 메세지를 출력 후 break;
				if(a.name != null || a.account != 0) {
					System.out.println("계좌 번호가 이미 생성 되었습니다.");
					System.out.println("입금 또는 출금하세요.");
					break;
				}
				System.out.println("이름을 등록하세요: ");
				a.name = sc.next();

				System.out.println("계좌 번호를 등록하세요: ");
				a.account = sc.nextInt();
				
				System.out.println("입력된 이름: " + a.getName() + "		입력된 계좌 번호: " + a.getAccount());
				break;
				
			case 1:
				if(a.name == null || a.account == 0) {
					System.out.println("계좌를 먼저 등록해 주세요.");
					break;
				}
				//입금
				System.out.println("입금할 금액을 입력하세요: ");
				a.deposit(sc.nextInt());
				System.out.println(a);
				break;
				
			case 2:
				if(a.name == null || a.account == 0) {
					System.out.println("계좌를 먼저 등록해 주세요.");
					break;
				}
				//출금
				System.out.println("출금할 금액을 입력하세요: ");
				a.withdraw(sc.nextInt());
				System.out.println(a);
				break;
				
			case 3:
			 break out;
			}
			
		} while(true);
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
