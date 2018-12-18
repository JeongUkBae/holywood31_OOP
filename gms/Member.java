package gms;


public class Member {
	String name; //멤버변수  -> 초기화 하면 안됨.
	
	public String bmi(Double hi, Double wi) {
		Double bmi1 = (wi/((hi*hi)/10000)); //로컬변수
		String result = "";
		
		if(bmi1>=40) {
			result = bmi1+" 고도비만";
		} else if(bmi1>=35) {
			result = bmi1+" 중등도비만";
		} else if(bmi1>=30) {
			result = bmi1+" 경도비만";
		} else if(bmi1>=25) {
			result = bmi1+" 과체중";
		} else if(bmi1>=18.5) {
			result = bmi1+" 정상";
		} else {
			result = bmi1+" 저체중";
		}
		return result ;
	} // bmi end 
	public String grade(String[] scores) {
		String grade1 = ""; // 로컬변수는 반드시 초기화 해야 한다. 원치 않는 값이 할당됨.
		/**
		 * 국어, 영어, 수학, 과학, 사회 점수를 입력받아서 평균을 낸뒤 
		 * 100 ~ 90 = A , 89 ~ 80 = B , ..... 를 내는 것.
		 * */
		int sum = 0;
		int[] sco = new int[5];
		for(int i=0; i<5; i++) {
			sco[i] = Integer.parseInt(scores[i]);
			sum += sco[i];
		}
		if(sum/5>=90) {
				grade1 = "A"; 
			} else if(sum/5>=80) {
				grade1 = "B"; 
			} else if(sum/5>=70) {
				grade1 = "C"; 
			} else if(sum/5>60) {
				grade1 = "D"; 
			} else if(sum/5>50) {
				grade1 = "F"; 
			}
		return grade1;
	}
	
	public String genderChecker(String ssn) {
		String chercker = "";
		/**
		 * 남여 체크
		 * */
		char sn = ssn.charAt(7);
		
		switch(sn) {
		case '1' : case '3' : chercker = "남자"; break;
		case '2' : case '4' : chercker = "여자"; break;
		case '5' : case '6' : chercker = "외국인"; break;
		default : chercker = "잘못된 주민번호입니다."; break;
		}
		return chercker;
		
	}


	
	
	
} //필드







