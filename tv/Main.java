package tv;

import javax.swing.JOptionPane;

public class Main {
		public static void main(String[] args) {
			TVBean tvBean = null;
			while (true) {
				switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
						+ "1.TV작동  2.TV정보보기 ")) { 
					case "0": 
						JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
								+ "\n종료중...");
						return;
					case "1": 
						/**
						 * brand,color,price 입력함
						 * TV브랜드
						 * TV색상
						 * 가격은 얼마입니까.
						 * */
						String brand = JOptionPane.showInputDialog("브랜드를 입력하세요.");
						String color = JOptionPane.showInputDialog("색상을 입력하세요.");
						String price = JOptionPane.showInputDialog("가격을 입력하세요.");
						tvBean = new TVBean();
						tvBean.setBrand(brand);
						tvBean.setColor(color);
						tvBean.setPrice(Integer.parseInt(price));
						
						break;
					case "2": 
						//구입한 TV스펙
						String spac =tvBean.toString();
						JOptionPane.showMessageDialog(null,spac);
						break;
				}
			}
			
	}//area
}//field


