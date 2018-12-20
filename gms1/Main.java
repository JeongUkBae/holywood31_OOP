package gms1;

import javax.swing.JOptionPane;

import bank01.Member;

public class Main {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("[학사관리] \n0.종료"
					+ "1.회원가입 2.회원정보")) {
				case "0" : 
					JOptionPane.showMessageDialog(null,"종료합니다.");
					return;
				case "1" : 
					String id = JOptionPane.showInputDialog("ID 입력");
					String name = JOptionPane.showInputDialog("이름 입력");
					String ssn = JOptionPane.showInputDialog("주민등록번호 입력");
					String pass = JOptionPane.showInputDialog("비밀번호 입력");
					
					break;
					
			}//main switch
		}//main while
	}//area
}//field
