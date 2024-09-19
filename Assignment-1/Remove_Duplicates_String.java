import java.util.*;


public class Remove_Duplicates_String {
    public static void main(String args[]){


        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char arr[] = str.toCharArray();

        HashMap<Character, Integer> mp = new HashMap<>();   // HashMap ka H and M capital hai !!!!

        for(char ch : arr){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }

        String ans = "";

        for(int i : mp.values()){
            System.out.print(i+" ");
        }

        System.out.println();

        for(char ch : mp.keySet()){
            ans+=ch;
        }

        System.out.println(ans);

        sc.close();

        
    }
    
}
