package gms;

import java.util.Random;

public class Lotto {
	public String randomNum() {
		String num = "";
		Random ranaom = new Random();
		int[] lot = new int[6];
		for(int i=0; i<lot.length; i++) {
			lot[i] += ranaom.nextInt(45);
			num += lot+",";
			System.out.println(num);
		}
		return num;
	}
}