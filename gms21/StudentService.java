package gms21;

import java.util.Random;

public class StudentService {

	public String hanbun() {
		String hanbunho = "";
		Random random = new Random();
		for(int i=0; i<10; i++) {
			if(i==1) {
				hanbunho += random.nextInt(10)+"-";
			}else {
				hanbunho += random.nextInt(10);
			}
		}
		
		return String.format(hanbunho); 
	}
	

	
}//field
