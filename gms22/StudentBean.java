package gms22;
/**
 * 학생정보 보여주기 
 * 학번, 이름, 주민번호, 비밀번호
 * */
public class StudentBean {
	final static String GMS_NAME = "비트학원";
	private String hanbun, name, ssn, pass;

	public void setHanbun(String hanbun) {
		this.hanbun = hanbun;
	}
	public String getHanbun() {
		return hanbun; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name; 
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
	
	@Override
		public String toString() {
			return String.format("[%s] 회원정보\n"
					+ "학번 : %s\n"
					+ "이름 : %s\n"
					+ "비밀번호 : %s\n",GMS_NAME,hanbun,name,pass);
		}
	
}//field
