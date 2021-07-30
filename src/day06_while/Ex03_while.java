package day06_while;

import java.util.Scanner;

public class Ex03_while {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.println("수 입력: ");
		i = input.nextInt();
		while(true) {
			temp=i%10;
			i=i/10;
			System.out.print(temp+ " ");
			if(i==0)
				break;
		}
		System.out.println();
	}

}
