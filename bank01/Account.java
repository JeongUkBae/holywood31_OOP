package bank01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * 계좌클래스
 * [속성] 
 * 상수 :  BANK_NAME 
 * 맴버변수 : 
 * 	1. accountNum 계좌번호 
 * 	2. money 잔액
 * 	3. today 해당일
 * [기능]
 *  1. generatorAccountNum() 계좌번호 생성(랜덤)
 *  2. today() 해당일 생성
 *  3. withdraw() 출금하기
 *  4. deposit() 입금하기
 *  5. accNuminfo() 계좌정보
 * */
public class Account {
	final static String BANK_NAME = "국민은행";
	String accountNum, today;
	int money;
	Account(int money) {
		this.accountNum = this.generatorAccountNum();
		this.today = this.today();
		this.money = money;
		
	}
	
	
	public String generatorAccountNum() {
		String accountNum="";
		Random random = new Random();
		for(int i=0; i<14; i++) {
			if(i==5) {
				accountNum += random.nextInt(10)+"-";
			} else if(i==7){
				accountNum += random.nextInt(10)+"-";
			} else {
				accountNum += random.nextInt(10);
			}
		}
		return accountNum;
	}
	
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		today = sdf.format(date);
		return today;
	}
	
	public int money() {
		int money = 0;
		return money;
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
		if(money>0 && this.money >= money) {
			this.money -= money;
			message = "거래완료";
		} else {
			message = "출금액이 잘못되었거나 잔고가 부족합니다.";
		}
		return message;
	}
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message ="";
		if(money>0) {
			this.money += money;
			message = "거래완료";
		} else {
			message = "입금액이 잘못되었습니다.";
		}
		return message;
	}
	/**
	 * */
	public String accNuminfo(String name) {
		
		String accNuminfo = String.format("[계좌정보] %s\n"
				+ "예금주명 : %s\n"
				+ "계좌번호 : %s\n"
				+ "생성날짜 : %s\n"
				+ "계좌잔액 : %s\n",BANK_NAME, name ,accountNum, today, money);
		
		return accNuminfo;
	}

}//field
