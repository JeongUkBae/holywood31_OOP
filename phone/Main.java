package phone;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone =null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean aPhone = null;
		while (true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
					+ "1.일반폰  2.휴대폰  3.아이폰 4. \n"
					+ "5. 6. 7.")) {
				case "0" :
					JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
							+ "\n종료중...");
					return;
				case "1" :
					phone = new PhoneBean();
					String kind = JOptionPane.showInputDialog("전화종류");
					String company = JOptionPane.showInputDialog("어느회사 제품"); //금성
					String call = JOptionPane.showInputDialog("통화내용");// 안녕
					// 종류: 일반전화기
					// 제조사: 금성
					// 통화내용: 안녕
					phone.setKind(kind);
					phone.setCompany(company);
					phone.setCall(call);
					String toString = phone.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				case "2" :
					celPhone = new CelPhoneBean();
					kind = JOptionPane.showInputDialog("전화종류");
					company = JOptionPane.showInputDialog("어느회사 제품"); //금성
					String move = JOptionPane.showInputDialog("이동가능여부");// 
					call = JOptionPane.showInputDialog("통화내용");// 안녕
					celPhone.setKind(kind);
					celPhone.setCompany(company);
					celPhone.setMove(move);
					celPhone.setCall(call);
					toString = celPhone.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				case "3" :
					iPhone = new IPhoneBean();
					kind = JOptionPane.showInputDialog("전화종류");
					company = JOptionPane.showInputDialog("어느회사 제품"); //금성
					move = JOptionPane.showInputDialog("이동가능여부");// 
					String date = JOptionPane.showInputDialog("검색");
					
					iPhone.setKind(kind);
					iPhone.setCompany(company);
					iPhone.setMove(move);
					iPhone.setDate(date);
					toString = iPhone.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				case "4" :	
					aPhone = new AndroidPhoneBean();
					kind = JOptionPane.showInputDialog("전화종류");
					company = JOptionPane.showInputDialog("어느회사 제품"); //금성
					move = JOptionPane.showInputDialog("이동가능여부");// 
					String display = JOptionPane.showInputDialog("몇인치");
					date = JOptionPane.showInputDialog("검색");
					
					aPhone.setKind(kind);
					aPhone.setCompany(company);
					aPhone.setMove(move);
					aPhone.setDisplay(display);
					aPhone.setDate(date);
					toString = aPhone.toString();
					JOptionPane.showMessageDialog(null,toString);
					break;
				
			}
		}
	}
}