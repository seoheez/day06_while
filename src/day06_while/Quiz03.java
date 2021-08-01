package day06_while;

public class Quiz03 {

	public static void main(String[] args) {
		
		int i = 1; 
		int sum = 0;
		for( ; ; i++) {
			if(i%2 ==1) {
				sum+=i;
			}
			if(sum >= 10000) break;
			//System.out.println(i+ " : " + sum);
		}
		System.out.println(i+ " : " + sum);

	}

}
