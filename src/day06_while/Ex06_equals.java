package day06_while;

import java.util.Scanner;

public class Ex06_equals {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫 번째 문자 입력: ");
		n1 = input.next();
		System.out.println("두 번째 문자 입력: ");
		n2 = input.next();
		System.out.println("n1 길이 : " + n1.length());
		System.out.println("n2 길이 : " + n2.length());
		System.out.println("n1 == n2 : "+ (n1==n2));
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
//		String str = null; //에러
		String str = "가"; //값이 있어야지만 .을 찍을 수 있다.
		System.out.println(str.equals(n1));
	}

}
