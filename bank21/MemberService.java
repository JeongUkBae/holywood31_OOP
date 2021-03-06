package bank21;

public interface MemberService {
	//회원가입
	public void join(String id,String name,String ssn,String pass) ;
	//----------------------------------------------------------------
	//목록보기
	public MemberBean[] list();
	//개인정보 검색
	public MemberBean find(String id);
	//로그인
	public boolean login(String id, String pass) ;
	//회원수
	public int count();
	//----------------------------------------------------------------
	//정보수정
	public void update() ;
	//회원탈퇴
	public void delete() ;
	
}
