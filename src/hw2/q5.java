package hw2;

public class q5 {

	public static void main(String[] args) {
		int counter =0;
		for(int i =1;i<=49;i++){
			if(i%10!=4&&i/10!=4) {
				counter=counter+1;
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		System.out.println("共"+counter+"個");
	}

}
