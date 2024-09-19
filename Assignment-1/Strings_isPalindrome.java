import java.util.Scanner;

public class Strings_isPalindrome {

    static boolean isPalin(String str){

        String temp = "";

        for(int i=str.length()-1; i>=0; i--){
            temp+=str.charAt(i);
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != temp.charAt(i)){
                return false;
            }
        }

        return true;


    }

    public static void main(String args[]){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isPalin(str));

        sc.close();

    }
    
}
