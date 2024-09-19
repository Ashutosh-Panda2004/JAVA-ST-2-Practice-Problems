import java.util.*;

public class Strings_String_Compression {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();

        HashMap<Character, Integer> mp = new HashMap<>();

        for(char ch : arr){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch, 1);
            }
        }

        StringBuilder ans = new StringBuilder();

        for(char ch : mp.keySet()){              // keySet(), Not keysSet()
            ans.append(ch);
            ans.append(mp.get(ch));
        }

        System.out.println(ans.toString());




        sc.close();

    }
}
