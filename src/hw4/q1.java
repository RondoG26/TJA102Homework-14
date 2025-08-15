package hw4;

public class q1{

    public static void main(String[] args) {
        int[] numbers = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double avg = (double) sum / numbers.length;
        System.out.println("平均值: " + avg);
        System.out.println("小於等於平均的數字:");

        for (int num : numbers) {
            if (num <= avg) {
                System.out.println(num);
            }
        }
    }
}
