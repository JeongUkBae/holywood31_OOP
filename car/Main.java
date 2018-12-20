package car;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CarBean carBean = null;
		while (true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
						+ "1.구입차  2.차차차 ")) { 
					case "0": 
						JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
									+ "\n종료중...");
						return;
					case "1": 
							/**
							 * 
							 * */
						String color = JOptionPane.showInputDialog("차 색상은 무엇인가요.");
						String gearType = JOptionPane.showInputDialog("기어타입은 무엇인가요.");
						String door = JOptionPane.showInputDialog("문은 몇개인가요.");
						carBean = new CarBean();
						carBean.setColor(color);
						carBean.setGearType(gearType);
						carBean.setDoor(Integer.parseInt(door));
						break;
					case "2": 
							// 제출한 카드의 스펙
						String spac = carBean.toString();
						JOptionPane.showMessageDialog(null, spac);
						break;
					
				}
			}
				
	}//area
}//field

