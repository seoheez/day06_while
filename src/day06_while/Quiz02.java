package day06_while;

public class Quiz02{

	public static void main(String[] args) {
		
		int sum=0, sum1=0;
		for(int i=1; i<1001; i++) {
			if(i%3==0 && i%5!=0) 
				sum1 += i;
				sum += i;
			
		}
		sum = sum - sum1;
		System.out.println(sum);
		
	}

}
