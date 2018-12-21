package phone;

public class AndroidPhoneBean extends IPhoneBean{
	private String display;
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}


	public String toString() {
		return String.format("종류: %s\n"
				+ "제조사: %s\n"
				+ "이동성: %s\n"
				+ "큰화면: %s\n"
				+ "검색: %s ",
				getKind(),getCompany(),getMove(),display,getDate());
	}
}
