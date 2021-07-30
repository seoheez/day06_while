package day06_while;

import java.util.Scanner;

public class Ex05_while {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1. 걷기 | 2. 대중교통 | 3. 종료");
			System.out.println(">");
			int select = input.nextInt();
			switch(select) {
			case 1: System.out.println("걸어가자");break;
			case 2: System.out.println("버스타자");break;
			case 3: System.out.println("종료");
				System.exit(9); //괄호 안의 숫자는 아무거나 넣어도 실행됨.
			}
		}
	}

}
