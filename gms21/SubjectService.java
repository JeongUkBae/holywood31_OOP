package gms21;

public class SubjectService {
	
	public String toString(String hanbun, String name, 
			String subjName,String profName, int score) {
		return String.format("[%s]\n"
				+ "학번: %s \n"
				+ "이름: %s \n"
				+ "과목명: %s \n"
				+ "강사명: %s \n"
				+ "과목점수: %s",StudentBean.GMS_NAME,hanbun,name,subjName,profName,score);
	}
}//field
