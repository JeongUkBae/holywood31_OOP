package gms;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
	
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료 \n1.회원관리  2.계산기 3.로또 4.달력 ");
			switch(menu) {
				case "0" : 
					JOptionPane.showMessageDialog(null,"시스템종료");
					return;
			
				case "1" : //회원관리 {
						Member m = new Member();
						String name = JOptionPane.showInputDialog("이름입력");
						m.name = name;
						JOptionPane.showMessageDialog(null, String.format("환영합니다. %s 님", m.name));
						String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n 0.상위메뉴 \n 1.BMI "
								+ "\n 2.학점(국어,영어,수학,과학,사회)\n "
								+ "3.성별체크(SSN)\n 4.시스템종료");
						switch(mMenu) {
							case "0" : break;
							case "1" : 
								String[] arr = JOptionPane.showInputDialog(null,"키,몸무게 입력" ).split(",");
								JOptionPane.showMessageDialog(null, String.format("%s 님의 BMI : %s 입니다."
										,m.name, m.bmi(Double.parseDouble(arr[0]), Double.parseDouble(arr[1]))));
								break;
							case "2" : //학점
								String[] scores = JOptionPane.showInputDialog(null,"국어,영어,수학,과학,사회 점수를 순서대로 입력하세요.").split(",");
								JOptionPane.showMessageDialog(null, String.format("%s 님의 학점: %s 입니다.",m.name, m.grade(scores)));
								break;
							case "3" : //성별체크
								String ssn = JOptionPane.showInputDialog(null,"주민번호를 입력하세요.(001010-1234555)");
								JOptionPane.showMessageDialog(null, String.format("%s 님은 '%s' 입니다.",m.name, m.genderChecker(ssn)));
								break;
							case "4" :JOptionPane.showMessageDialog(null,"시스템종료");
								return;
					}//회원관리 스위치 
				case "2" : 	//계산기 {
						Calc c = new Calc();
						String cMenu = JOptionPane.showInputDialog(null,"[계산기 메뉴] \n 0.상위메뉴 \n 1.계산기 2.구구단 \n"
								+ "3.시스템종료");
						switch(cMenu) {
							case "0" :  break;
							case "1" :  
								String[] op = JOptionPane.showInputDialog(null,"[계산기]입력하세요. ").split(" ");
								switch(op[1]) {
									case "+" :
										JOptionPane.showMessageDialog(null,String.format("%s %s %s 답은 '%s' 입니다.", 
										op[0],op[1],op[2],c.plus(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
										break;
									case "-" :  
										JOptionPane.showMessageDialog(null,String.format("%s %s %s 답은 '%s' 입니다.", 
										op[0],op[1],op[2],c.minus(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
										break;
									case "*" :  
										JOptionPane.showMessageDialog(null,String.format("%s %s %s 답은 '%s' 입니다.", 
										op[0],op[1],op[2],c.multi(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
										break;
									case "/" :  
										JOptionPane.showMessageDialog(null,String.format("%s %s %s 답은 '%s' 입니다.", 
										op[0],op[1],op[2],c.divid(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
										break;
									case "%" : 
										JOptionPane.showMessageDialog(null,String.format("%s %s %s 답은 '%s' 입니다.",
										op[0],op[1],op[2],c.mod(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
										break;
								}
						
							case "2" : 
								String x = JOptionPane.showInputDialog(null,"원하는 x 단을 입력하세요.");
								JOptionPane.showMessageDialog(null,String.format("[%s 단] \n%s",x,c.gugudan(Integer.parseInt(x)))); 
								break;
							case "3" :  return;
							
						}//calc end
						
					case "3" : //로또 
						Lotto l = new Lotto();
						String sel = JOptionPane.showInputDialog(null,"[Lotto] \n 0.상위메뉴 1.번호생성받기 2.다시받기");	
						switch(sel) {
							case "0" : return;
							case "1" : JOptionPane.showMessageDialog(null,String.format("[Lotto] 번호생성 \n%s ",l.randomNum()));
								break;
							case "2" : continue;
						}
						
						break;
					
			}//메뉴 스위치 
		
		}
	
	}
}