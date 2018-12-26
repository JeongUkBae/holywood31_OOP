package bank42;
/**
 * 
[데이터 핸들링 종류]
추가 (Create)         -  set - void
조회(findALL) list - Read   - get - Object
조회(findSome) findByName - Read - get -Object 
조회(findOne) findById - Read  - get - Object
조회(count) count - Read - get - String
조회(exist) exist - Read - get - boolean
수정 (Update)        - set - void
삭제 (Delete)         - set - void
 * */
public interface AccountService {
	// 서비스 로직에는 맴버변수를 두지 않는다. 
	/**
	 * CREATE
	 * */
	public void createAccount(int money);
	public String makeAccountNum(); //계좌생성
	/**
	 * READ
	 * */
	public AccountBean[] findAll();
	public AccountBean[] findByMemberId(String id);
	public AccountBean findByAccountNum(String accountNum);
	public int countAccount();
	public boolean existAccount(String accountNum);
	public String info(String accountNum,  
			String name ,String today, int money);//계좌정보여주기
	public String findToday(); //오늘날짜구하기
	/**
	 * UPDATE
	 * */
	public String withdrawMoney(int money); //출금하기
	public String depositMoney(int money); //입금하기
	/**
	 * DELETE
	 * */
	public void deleteAccountNum();

}
