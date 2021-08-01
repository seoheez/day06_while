package day06_while;

import java.util.Scanner;

public class Quiz09_커피자판기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		int j = 0;
		
		System.out.println("요금을 투입하세요 >>");
		money = scan.nextInt();
		for(;;) {
			System.out.println("======== 커피 자판기 ========\n");
			System.out.println("1. 커피(200)\t2. 코코아(250)\t 3. 반환\t4. 종료");
			System.out.println("메뉴를 선택하세요>>>");
			j = scan.nextInt();
			
			if(j == 4) break;
			else if((j == 1 && money < 200) || (j == 2 && money < 250)) {
				System.out.println("요금이 부족합니다.");
			}
			else if(j == 1) {
				System.out.println("맛있게 드세요\n");
				money -= 200;
			}
			else if(j == 2) {
				System.out.println("맛있게 드세요\n");
				money -= 250;
			}
			else if(j == 3) {
				System.out.println("거스름돈: " + money);
				money = 0;
			}
			else {
				System.out.println("잘못 입력하셨습니다.\n\n");
				
			}
		}
		System.out.println("프로그램 종료");

	}

}
