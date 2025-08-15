package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		int no;
		System.out.println("請輸入要避開的數字");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		List<Integer> validNumbers = new ArrayList<>();
		int lineCounter = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != no && i / 10 != no) {
				validNumbers.add(i);
				System.out.printf("%2d ", i); // 格式對齊，2 格寬度

				lineCounter++;
				if (lineCounter == 6) {
					System.out.println(); // 換行
					lineCounter = 0; // 重設列計數器
				}
			}

		}
		if (lineCounter != 0) {
			System.out.println();
		}
		System.out.println();
		System.out.println("共" + validNumbers.size() + "個");
		 if (validNumbers.size() < 6) {
	            System.out.println("可選號碼少於6個，無法隨機選出。");
	        } else {
	            Collections.shuffle(validNumbers); // 打亂順序
	            List<Integer> luckyNumbers = validNumbers.subList(0, 6);
	            Collections.sort(luckyNumbers); // 排序好看一點
	            System.out.println("隨機選出的 6 個號碼是：" + luckyNumbers);
	        }

	}

}
