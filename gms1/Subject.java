package gms1;
/**
 * 속성: 과목, 교수명, 성적
 * 기능: exam -시험 성적, today - 오늘날짜, score - 시험결과
 * */
public class Subject {
	String subjName, profName;
	int score;
	Subject(String subjName, String profName, int score){
		this.subjName = subjName;
		this.profName = profName;
		this.score = score;
	}
	/**
	 * 시험성적 
	 * */
	public String exam() {
		String exam = "";
		return exam;
	}
	/**
	 * 오늘날짜생성
	 * */
	public String today() {
		String today = "";
		return today;
	}
	/**
	 * 시험결과 보여주기
	 * */
	public String scores() {
		String scores = "";
		return scores;
	}
	
}//field
