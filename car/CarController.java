package car;
import javax.swing.JOptionPane;

public class CarController {
	public static void main(String[] args) {
		CarBean carBean = null;
		CarService carService = new CarServiceImpl();
		while (true) {
			switch(JOptionPane.showInputDialog("[환영합니다.] 0.종료 \n"
						+ "1.차량입고  2.차량목록 3.차량검색 4.차량판매")) { 
					case "0": 
						JOptionPane.showMessageDialog(null,"이용해주셔서 감사합니다. "
									+ "\n종료중...");
						return;
					case "1": 
							/**
							 * 
							 * */
						String brand = JOptionPane.showInputDialog("어느 회사차인가요.");
						String color = JOptionPane.showInputDialog("차 색상은 무엇인가요.");
						String gearType = JOptionPane.showInputDialog("기어타입은 무엇인가요.");
						String door = JOptionPane.showInputDialog("문은 몇개인가요.");
						carService.add(brand,color,gearType,Integer.parseInt(door));
						break;
					case "2": 
						carService.list();
							// 제출한 카드의 스펙
						JOptionPane.showMessageDialog(null, carBean.toString());
						break;
					case "3" : 
						carService.find();
						break;
					case "4" : 
						carService.sell();
						break;
					
				}
			}
				
	}//area
}//field

