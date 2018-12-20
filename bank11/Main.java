package bank11;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while (true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
					+ "1.회원가입  2.회원정보  3.계좌생성 4.계좌확인 \n"
					+ "5.입금 6.출금 7.비밀번호 변경")) {
				case "0" :
					JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
							+ "\n종료중...");
					return;
				case "1" : 
					String id = JOptionPane.showInputDialog("ID 입력");
					String name = JOptionPane.showInputDialog("실명 입력");
					String ssn = JOptionPane.showInputDialog("주민번호 확인");
					String pass = JOptionPane.showInputDialog("비밀번호입력");
					member = new Member(id, name, ssn, pass);
					break;
				case "2" : 
					String info = member.toString();
					JOptionPane.showMessageDialog(null, info);
					break;
				case "3" :
					account = new Account(0); 
					JOptionPane.showMessageDialog(null,"계좌를 생성하였습니다.");
					break;
				case "4" :
					String accNuminfo = account.toString();
					JOptionPane.showMessageDialog(null, accNuminfo);
					break;
				case "5" :
					String inputMoney = JOptionPane.showInputDialog("입금액을 입력하세요.");
					String message = account.deposit(Integer.parseInt(inputMoney));
					JOptionPane.showMessageDialog(null,message);
					break;
				case "6" :
					String outputMoney = JOptionPane.showInputDialog("출금액을 입력하세요.");
					String message2 = account.withdraw(Integer.parseInt(outputMoney));
					JOptionPane.showMessageDialog(null,message2);
					break;
				case "7":
					String passch = JOptionPane.showInputDialog(null,"변경할 비밀번호를 입력하세요.");
					member.setPass(passch);
					JOptionPane.showMessageDialog(null,"비밀번호가 변경되었습니다.");
					break;
			}
		}

	} //area
}//field
