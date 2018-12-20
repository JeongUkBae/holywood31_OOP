package gms21;
/**
 * 속성: 과목, 교수명, 성적
 * 기능: exam -시험 성적, today - 오늘날짜, score - 시험결과
 * */
public class SubjectBean {
	private String subjName, profName;
	private int score;

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}
	public String getSubjName() {
		return subjName;
	}
	public void setprofName(String profName) {
		this.profName = profName;
	}
	public String getprofName() {
		return profName;
	}
	public void setScore(int score ) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return String.format("");
	}
	
}//field
