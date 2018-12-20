package bank21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	
	// 서비스 로직에는 맴버변수를 두지 않는다. 
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
	
	
	public String toString(String accountNum, 
			String name ,String today, int money) {
		return String.format("[계좌정보] %s\n"
				+ "계좌번호 : %s\n"
				+ "이름 : %s\n"
				+ "생성날짜 : %s\n"
				+ "계좌잔액 : %s\n",AccountBean.BANK_NAME, //상수는 클래스 이름.상수이름
				accountNum,name ,today, money);
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
/*		if(money>0 && this.money >= money) {
			this.money -= money;
			message = "거래완료";
		} else {
			message = "출금액이 잘못되었거나 잔고가 부족합니다.";
		}
*/		return message;
	}
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message ="";
/*		if(money>0) {
			this.money += money;
			message = "거래완료";
		} else {
			message = "입금액이 잘못되었습니다.";
		}
*/		return message;
	}
	/**
	 * */
}
