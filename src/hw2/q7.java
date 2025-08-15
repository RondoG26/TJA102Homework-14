package hw2;

public class q7 {
	public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            char a = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
            }
            System.out.println(); 
        }
    }
}
