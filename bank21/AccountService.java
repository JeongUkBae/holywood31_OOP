package bank21;

public interface AccountService {
	
	// 서비스 로직에는 맴버변수를 두지 않는다. 
	/**
	 * 계좌번호 랜덤생성
	 * */
	public String generatorAccountNum();
	/**
	 * 오늘날짜구하기
	 * */
	public String today();
	/**
	 * 계좌정보 보여주기
	 * */
	public String toString(String accountNum, 
			String name ,String today, int money);
	/**
	 * 출금하기
	 * */
	public String withdraw(int money);
	/**
	 * 입금하기
	 * */

	public String deposit(int money);
	
}
