package gms22;

import java.util.Random;

public class StudentService {
	public String ranhanbun() {
		String ranhanbun = "";
		Random random = new Random();
		for(int i=0; i<10; i++) {
			if(i==1) {
				ranhanbun += random.nextInt(10)+"-";
			} else {
			ranhanbun += random.nextInt(10);
			}
		}
		return ranhanbun;
	}
	
}//field
