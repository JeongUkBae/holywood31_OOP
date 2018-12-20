package gms21;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean studentBean = null;
		StudentService studentService = new StudentService();
		SubjectBean subjectBean = null;
		SubjectService subj = new SubjectService();
		while (true) {
			/**
			 * 성적표에 표시될 내용:
			 * 학번(Student) (랜덤 4자리수)
			 * 학생이름(Student)
			 * 과목명(subject)
			 * 점수(Subject)
			 * 
			 * */
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
					+ "1.학생부등록  2.비번병경  3.회원정보보기 4.수강과목등록 \n"
					+ "5.교수등록 6.점수등록 7.성적표보기")) {
				case "0" :
					JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
							+ "\n종료중...");
					return;
				case "1" :
					String name = JOptionPane.showInputDialog("이름 입력");
					String ssn = JOptionPane.showInputDialog("주민번호입력");
					String pass = JOptionPane.showInputDialog("비밀번호입력");
					studentBean = new StudentBean();
					studentBean.setName(name);
					studentBean.setSsn(ssn);
					studentBean.setPass(pass);
					studentService = new StudentService();
					studentBean.setHanbun(studentService.hanbun());
					String hanbun = studentBean.getHanbun();
					JOptionPane.showMessageDialog(null,String.format("등록되었습니다.\n 학번: %s",hanbun));
					break;
				case "2":
					String chpass = JOptionPane.showInputDialog("바꿀 비밀번호 입력하세요.");
					studentBean.setPass(chpass);
					break;
				case "3":
					String toString = studentBean.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				case "4":
					subjectBean = new SubjectBean();
					String subjName = JOptionPane.showInputDialog("수강하고자 하는 과목명을 입력하세요.");
					subjectBean.setSubjName(subjName);
					break;
				case "5":
					String profName = JOptionPane.showInputDialog("강서명을 입력하세요.");
					subjectBean.setprofName(profName);
					break;
				case "6":
					String score = JOptionPane.showInputDialog("점수를 입력하세요");
					subjectBean.setScore(Integer.parseInt(score));
					break;
				case "7":
					String toString2 =subj.toString(studentBean.getHanbun(),studentBean.getName(),
							subjectBean.getSubjName(),subjectBean.getprofName(),subjectBean.getScore());
					JOptionPane.showMessageDialog(null,toString2);
					break;
			}
		}

	} //area
}//field
