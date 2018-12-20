package bank01;

public class Member {
	String id, name,  ssn, pass; // 맴버변수=인스턴스변수
	Member(String id, String name, 
			String ssn, String pass) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	/**
	 * 회원정보 보여주기
	 * */
	public String info() {
		String info = "";
		return String.format("정보확인\n"
				+ "ID : %s \n "
				+ "이름 : %s \n"
				+ "주민번호 : %s \n"
				+ "비밀번호 : %s \n", id, name, ssn, pass);
	}
	
}//field
