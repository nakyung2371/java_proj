package lab.chap17.account;

import java.util.List;

import chap17.ex02.Student;

public class Account {
	
	String name;		//이름
	int account;		//계좌번호
	int money = 10000;			//계좌에 입금된 돈
	
	Account() {}
	Account(String name, int account) {this.name = name; this.account = account;}
	
	void deposit(int money) {		//입금 <- 00원 입금되었습니다. 계좌의 총 금액은 0000원입니다.
		this.money += money;
		System.out.println(money + "원 입금 되었습니다. 계좌의 총 금액은 " + this.money + "원입니다.");
	}
	
	void withdraw(int money) { 	//출금 <- 00원 출금되었습니다. 계좌의 총 금액은 0000원입니다.
		this.money -= money;
		System.out.println(money + "원 출금 되었습니다. 계좌의 총 금액은 " + this.money + "원입니다.");
	}
	
	
	//setter / getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + "]";
	}
	
	
}
