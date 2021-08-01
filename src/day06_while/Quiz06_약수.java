package day06_while;

import java.util.Scanner;

public class Quiz06_약수 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, cnt = 1;
		System.out.println("수 입력: ");
		num = input.nextInt();
		
		while(true) {
			if(num % cnt == 0)
				System.out.println(cnt + " ");
			if(num == cnt) break;
			cnt ++;
		}
	
		
	}

}
