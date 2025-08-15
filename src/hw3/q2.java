package hw3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);

		
		j=(int)(Math.random()*100);
		while(true) {
			System.out.println("請輸入一個數字");
			i = sc.nextInt();
		if(i>j) {
			System.out.println("比答案大");
		}else if(i<j) {
			System.out.println("比答案小");
		}else {
			System.out.println("答對了");
			break;
		}}
		sc.close();
	}

}
