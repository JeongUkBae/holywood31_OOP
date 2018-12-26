package bank42;
/**
 * 
[데이터 핸들링 종류]
추가 Create         -  set - void
조회(ALL) list - Read   - get - Object
조회(Some) findByName - Read - get -Object 
조회(One) findById - Read  - get - Object
조회(Num) count - Read - get - String
조회(True) exist - Read - get - boolean
수정 Update        - set - void
삭제 Delete         - set - void
 * */
public interface MemberService {
	/**
	 * CREATE
	 * */
	public void join(String id,String name,String ssn,String pass) ;
	/**
	 * READ
	 * */
	public MemberBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public boolean existId(String id) ;
	public boolean existMember(String id, String pass) ;
	public int countMember();
	/**
	 * UPDATE
	 * */
	public void updatePassword(String id, String pass, String newpass) ;
	/**
	 * DELETE
	 * */
	public void deleteMember(String id, String pass) ;
	
	
}
