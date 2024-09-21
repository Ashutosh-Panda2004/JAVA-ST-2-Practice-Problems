import java.util.Scanner;

public class Student_Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean isValid = checkRecord(s);

        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }

    public static boolean checkRecord(String s) {
        int cntA = 0;

        for (int c = 0; c < s.length(); c++) {
            if (s.charAt(c) == 'A') cntA++;
        }

        if (cntA >= 2) {
            return false;
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                return false;
            }
        }

        return true;
    }
}
