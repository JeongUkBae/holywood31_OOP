package bank31;

public class MemberBean {
	private String id, name,  ssn, pass; // 맴버변수=인스턴스변수

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { //getter 게터
		return name;  //read
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	/**
	 * 회원정보 보여주기
	 * */
	public String toString() {
		String info = "";
		return String.format("정보확인\n"
				+ "ID : %s \n"
				+ "이름 : %s \n"
				+ "비밀번호 : %s \n", id, name, pass);
	}
	
}//field
