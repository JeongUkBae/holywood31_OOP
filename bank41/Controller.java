package bank41;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		MemberBean memberBean = null;
		MemberService memberService = new MemberServiceImpl();
		
		while(true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
					+ "1.회원가입  2.회원정보  3.계좌생성 4.계좌확인 \n"
					+ "5.입금 6.출금 7.비밀번호 변경\n "
					+ "8.회원목록 9.회원검색 10.로그인 11.가입인원수 \n"
					+ "12.비밀번호변경 13.회원탈퇴")) {
			case "0" : JOptionPane.showMessageDialog(null,"종료합니다.");
				return;
			case "1" : 
				memberService.join(JOptionPane.showInputDialog("ID를 입력하세요."),
						JOptionPane.showInputDialog("이름을 입력하세요."),
						JOptionPane.showInputDialog("주민번호를 입력하세요."),
						JOptionPane.showInputDialog("비밀번호를 입력하세요."));
				JOptionPane.showMessageDialog(null,"가입되었습니다.");
				break;
			case "2" : 
				memberBean = new MemberBean();
				JOptionPane.showMessageDialog(null,String.format(memberBean.toString()));
				break;
			case "3" : break;
			case "4" : break;
			case "5" : break;
			case "6" : break;
			case "7" : break;
			case "8" : 
				JOptionPane.showMessageDialog(null,memberService.list());
				break;
			case "9" : 
				JOptionPane.showMessageDialog(null,
						memberService.find(JOptionPane.showInputDialog(
								"아이디를 입력하세요.")));
				break;
			case "10" : 
				boolean ok = memberService.login(JOptionPane.showInputDialog("아이디입력"),
						JOptionPane.showInputDialog("비밀번호입력"));
				JOptionPane.showMessageDialog(null,(ok) ? "로그인 성공" : "로그인 실패");
				
				break;
			case "11" :
				JOptionPane.showMessageDialog(null,memberService.count());
				break;
			case "12" :
				memberService.update(JOptionPane.showInputDialog("아이디"),
						JOptionPane.showInputDialog("비밀전호번호"),
						JOptionPane.showInputDialog("변경할 비밀번호입력"));
				break;
			case "13" :
				memberService.delete(JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				
				break;
				
			}//switch
			
		}//while

	} //area
}//field
