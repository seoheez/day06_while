package day06_while;

public class Quiz003 {

	public static void main(String[] args) {

		int a, b;
		for(a = 1; a<=6; a++) {
			for(b = 1; b<=6; b++) {
				if(a + b == 6) {
					System.out.println("주사위의 합이 6인 경우: " + a + "," + b);
				}
			}
		}
	}

}
