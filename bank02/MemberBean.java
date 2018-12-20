package bank02;

public class MemberBean {
	private String id, name,  ssn, pass; // 맴버변수=인스턴스변수
	public MemberBean(String id, String name, 
			String ssn, String pass) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	public String getId() {
		return id;
	}
	public String getName() { //getter 게터
		return name;  //read
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
