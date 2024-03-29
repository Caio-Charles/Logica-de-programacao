//Em ordem crescente.

import java.util.Scanner;

public class Main1042 {
	public static void main(String[] args) {
		// Entrada:
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		input.close();
		
		if(a < b && b < c) {//C foi o maior de todos
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		if(b < a && a < c) { // C maior de todos
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
		if(a < c && c < b) { //B maior de todos
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		if(a > c && a < b) { //B maior de todos
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		if(b < c && c < a) { //A maior de todos
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		if(b > c && b < a) { //A maior de todos
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
			System.out.println();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
}