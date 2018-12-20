package gms22;
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
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfName() {
		return profName; 
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score; 
	}
	
/*	@Override
		public String toString(String hanbun, String name) {
			return String.format("[%s] 성적표\n"
					+ "학번: %s\n"
					+ "이름: %s\n"
					+ "과목: %s\n"
					+ "강사: %s\n"
					+ "점수: %s",StudentBean.GMS_NAME,hanbun,name,
					subjName,profName,score);
		}*/
}//field
