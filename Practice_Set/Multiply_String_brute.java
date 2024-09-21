package Practice_Set;

import java.util.Scanner;

public class Multiply_String_brute {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		long num1 = Long.parseLong(str1);
		long num2 = Long.parseLong(str2);
		
		long mul = num1*num2;
		
		String ans = Long.toString(mul);
		
		System.out.println(ans);
		
		sc.close();
	}
    
}
