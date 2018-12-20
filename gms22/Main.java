package gms22;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		StudentBean studentBean = null;
		StudentService studentService = new StudentService();
		SubjectBean subjectBean = null;
		while(true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
					+ "1.학생부등록  2.비번변경  3.회원정보보기 4.수강과목등록 \n"
					+ "5.교수등록 6.점수등록 7.성적표보기")) {
				case "0" : 
					JOptionPane.showMessageDialog(null,"감사합니다. \n종료...");
					return;
				case "1" :
					String name = JOptionPane.showInputDialog("이름 입력");
					String ssn = JOptionPane.showInputDialog("주민번호 입력");
					String pass = JOptionPane.showInputDialog("비밀번호 입력");
					studentBean = new StudentBean();
					studentBean.setName(name);
					studentBean.setSsn(ssn);
					studentBean.setPass(pass);
					studentBean.setHanbun(studentService.ranhanbun());
					String hanbun = studentService.ranhanbun();
					JOptionPane.showMessageDialog(null,String.format("등록되었습니다.\n"
							+ "학번: %s",hanbun));
					break;
				case "2" :
					String chpass = JOptionPane.showInputDialog("비밀번호 변경");
					studentBean.setPass(chpass);
					JOptionPane.showMessageDialog(null,"비밀번호가 변경되었습니다.");
					break;
				case "3" :
					String toString = studentBean.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				case "4" :
					subjectBean = new SubjectBean();
					String subjName = JOptionPane.showInputDialog("과목 등록");
					subjectBean.setSubjName(subjName);
					JOptionPane.showMessageDialog(null,"과목을 등록하였습니다.");
					break;
				case "5" :
					String profName = JOptionPane.showInputDialog("강사 등록");
					subjectBean.setProfName(profName);
					JOptionPane.showMessageDialog(null,"강사를 등록하였습니다.");
					break;
				case "6" :
					String score = JOptionPane.showInputDialog("점수 등록");
					subjectBean.setScore(Integer.parseInt(score));
					JOptionPane.showMessageDialog(null,"강사를 등록하였습니다.");
					break;
				case "7" :
				/*	String toString2 =subjectBean.toString(studentBean.getHanbun(), 
							studentBean.getName());
					JOptionPane.showMessageDialog(null, toString2);*/
					break;
					
			}//switch
			
		}//while
		
	} //area
}//field
