package hw3;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形的三邊長");
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		if(i + j <= k || i + k <= j || j + k <= i) {
		    System.out.println("這不是三角形");
		} else if(i == j && j == k) {
		    System.out.println("這是一個正三角形");
		} else if(i == j || j == k || i == k) {
		    System.out.println("這是一個等腰三角形");
		} else {
		    System.out.println("其他三角形");
		}
		sc.close();
	}

}
