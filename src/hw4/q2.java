package hw4;

public class q2 {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] cArray = s.toCharArray();
		char[]reversecArray=new char[cArray.length];
		for(int i =0;i<cArray.length;i++) {
			reversecArray[i] = cArray[cArray.length-1-i];
			System.out.print(reversecArray[i]);
		}
		
	}
}
