package hw1;

public class q3 {

	public static void main(String[] args) {
		int totalsec=256559;
		int days = totalsec/86400;
		int hours = totalsec%86400/3600;
		int minutes =totalsec%86400%3600/60;
		int seconds =totalsec%86400%3600%60;
		System.out.println("一共是"+days+"天"+hours+"時"+minutes+"分"
				+seconds+"秒");
	}

}
