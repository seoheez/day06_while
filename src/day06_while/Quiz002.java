package day06_while;

public class Quiz002 {

	public static void main(String[] args) {
		
		int dan, hang;
		while(true) {
			for(dan=2; dan<10; dan++) {
				System.out.println(dan + "단");
				for(hang=1; hang <10; hang++) {
					if(dan < hang) 
					break;
					System.out.printf("%d x %d = %d \n", dan, hang, dan*hang);
				}
				System.out.println(); 
			} break;
			
		}

	}

}
