import java.util.Scanner;
import java.util.*;

public class Anagram {

    	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		// char frq. arr
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		for(int i=0; i<str1.length(); i++){
		    arr1[str1.charAt(i)-'a']++;
		}
		
		for(int i=0; i<str2.length(); i++){
		    arr2[str2.charAt(i)-'a']++;
		}
		
		boolean flg = true;
		
		for(int i=0; i<arr1.length; i++){
		    if(arr1[i]!=arr2[i]){
		        flg = false;
		        break;
		    }
		}
		
		if(flg) System.out.println("VALID ANAGRAM");
		else System.out.println("NOT ANAGRAM");
		
		
		sc.close();
	}
    
}
