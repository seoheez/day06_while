package day06_while;

public class Quiz01 {

	public static void main(String[] args) {

		int day, won=1;

		for(day=1; day<31; day++) {
			if(day==1) {
				won = 1;
			}else {
				won*=2;
			}
 			System.out.println(day + ": " + won);
		}
		System.out.println("30일째 되는 날 예치 금액: " + won);
	}


}
