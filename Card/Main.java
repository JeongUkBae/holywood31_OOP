package Card;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardBean cardBean = null;
		while (true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
						+ "1.카드선택  2.TV정보보기 ")) { 
					case "0": 
						JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
									+ "\n종료중...");
						return;
					case "1": 
							/**
							 * 카드의 종류
							 * 카드의 번호
							 * */
						cardBean = new CardBean();
						String kind = JOptionPane.showInputDialog("카드종류입력");
						String number = JOptionPane.showInputDialog("카드번호입력");
						cardBean.setKind(kind);
						cardBean.setNumber(Integer.parseInt(number));
						
						break;
					case "2": 
							// 제출한 카드의 스펙
						String spac = cardBean.toString();
						JOptionPane.showMessageDialog(null, spac);
						break;
					
				}
			}
				
	}//area
}//field

