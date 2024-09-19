import java.util.*;

public class Form_Biggest_Number {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        String str_arr[] = new String[n];

        for(int i=0; i<n; i++){
            str_arr[i] = Integer.toString(arr[i]);   // remember  Integer.toString();
        }

        Arrays.sort(str_arr, (a,b)->(b+a).compareTo(a+b));  // Remember custom comparator syntax and (a,b)->(b+a).compareTo(a+b)

        if(str_arr[0]=="0") System.out.println("0");

        else{

            StringBuilder res = new StringBuilder();
            for (String s : str_arr) {
                res.append(s);
            }

            System.out.println(res);
    
    }








        sc.close();
    }

    
}
