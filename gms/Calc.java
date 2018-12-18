package gms;

public class Calc {
	
	public String plus(int a, int b) {
		String res = "";
		int sum = a+b;
		res = ""+sum;
		return res;
	}
	public String minus(int a, int b) {
		String res = "";
		int sum = a-b;
		res = ""+sum;
		return res;
	}
	public String multi(int a, int b) {
		String res = "";
		int sum = a*b;
		res = ""+sum;
		return res;
	}
	public String divid(int a, int b) {
		String res = "";
		int sum = a/b;
		res = ""+sum;
		return res;
	}
	public String mod(int a, int b) {
		String res = "";
		int sum = a%b;
		res = ""+sum;
		return res;
	}
	
	public String gugudan(int dan) {//) {
		String res ="";
		int sum = 0;

		for(int i=0; i<9; i++) {
			sum = dan * (i+1);
			res += dan +"x"+(i+1)+"="+sum+"\n";
		}
		return res;
	}

}
