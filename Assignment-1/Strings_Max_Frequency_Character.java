import java.util.Scanner;
import java.util.*;

public class Strings_Max_Frequency_Character {

    public static void main(String args[]){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int arr[] = new int[26];

        

        for(int i=0; i<str.length(); i++){ 
            arr[str.charAt(i)-'a']++;               // REMEMBER THIS char TO int CONVERSION 
        }

        int maxidx = 0, maxi = Integer.MIN_VALUE;   // REMEMBER THIS MIN VALUE

        for(int i=0; i<arr.length; i++){
            if(maxi<arr[i]){
                maxi=arr[i];
                maxidx = i;
            }
        }

        System.out.println((char)(maxidx+'a'));  // REMEMBER THIS TYPECASTING 

        sc.close();

    }
    
}
