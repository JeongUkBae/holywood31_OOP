package bank;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {
	final static String BANK_NAME = "국민은행";  //상수 
	String accountNum, today;
	int money;
	Account(int money) {
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}	
	private String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		// 1234-5678
		int[] a = new int[8];
		for(int i=0; i<8;i++) {
			if(i==3) {
				accountNum += random.nextInt(10)+"-"; 
			} else
				accountNum += random.nextInt(10);
			}
		return accountNum;
		}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		today = sdf.format(date);
		return today;
	}
	
	public String open(String name) {
		return String.format("은행이름 : %s \n"
				+ "계좌번호 : %s \n"
				+ "이   름 : %s\n"
				+ "신규개설일: %s \n"
				+ "잔   액 : %d ",BANK_NAME, accountNum,name,today,money);
	}
}
