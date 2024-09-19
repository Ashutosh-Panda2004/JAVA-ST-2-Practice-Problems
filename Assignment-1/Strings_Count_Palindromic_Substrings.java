import java.util.*;

public class Strings_Count_Palindromic_Substrings {

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  string");
        String str = sc.nextLine();


        int cnt = 0;
        String temp = "";
        

        for(int i=0; i<str.length(); i++){
            for(int j =i; j<str.length(); j++){
                temp = "";
                for(int k =i; k<=j; k++){
                    temp += str.charAt(k);
                }
                if(isPalin(temp)) cnt++;
            }
            
        }
        System.out.println(cnt);

        sc.close();
    }

    
    
}
