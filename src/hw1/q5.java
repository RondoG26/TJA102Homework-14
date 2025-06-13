package hw1;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FV ＝ PV×（1 ＋ R）n 次方//
		double money = 1500000;
		double rate = 1+0.02;
		double total =money*Math.pow((double)(rate), 10);
		System.out.println(total+"元");
	}

}
