package day06_while;

import java.util.Scanner;

public class Quiz08_로그인 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String saveID = null, savePW = null;
		String newID = null, newPW = null;
		
		int num;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.println(">");
			
			num = scan.nextInt();
			if(num == 3) {
				System.out.println("프로그램 종료합니다!!!");
				break;
			}
			switch(num) {
			case 1:
				System.out.println("아이디 입력: ");
				newID = scan.next();
				System.out.println("비밀번호 입력: ");
				newPW = scan.next();
				
				if(newID.equals(saveID) && newPW.equals(savePW)) {
					System.out.println("인증 성공!!!");
				}else System.out.println("인증 실패!!!");
				 	break;
				 	
			case 2:
				System.out.println("저장할 아이디 입력: ");
				saveID = scan.next();
				System.out.println("저장할 비밀번호 입력: ");
				savePW = scan.next();
				System.out.println("가입 완료!!!");
				
					
			}
		}

	}

}
