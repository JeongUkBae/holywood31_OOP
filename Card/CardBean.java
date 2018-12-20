package card;

public class CardBean {
	private String kind; //카드종류: 스페이스,다이아,하트,클로버
	private int number;

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}

	public String toString() {
		return String.format("카드스팩\n"
				+ "카드: %s \n"
				+ "번호: %s \n",kind,number);
	}
}
