package day06_while;

import java.util.Scanner;

public class Quiz001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i, j;
		long multi = 1;

		while(true) {
			System.out.println("숫자 20을 입력하세요: ");
			i = input.nextInt();
			if(i == 20) {
				break;
			}
			System.out.println("오류");
		}
		for(j = 1; j<=i; j++) {
			multi*=j;
		}	System.out.println("1~20까지의 곱: "+ multi);



	}


}