import java.util.*;

public class Chocolate_Distribution {

    public static void main(String args[]){
        int m,n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int choco[] = new int[n];

        for(int i=0; i<n; i++){
            choco[i] = sc.nextInt();
        }

        Arrays.sort(choco);
        
       

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            mini = Math.min(mini, choco[i + m - 1] - choco[i]);
        }

        System.out.println(mini);
        
    }
    
}

/*
 * A = {3, 4, 1, 9, 56, 7, 9, 12}
 * 1 3 4 7 9 9 12 56
*/