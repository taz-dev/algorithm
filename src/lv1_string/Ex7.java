package lv1_string;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public String solution(String str) {
        String answer = "YES";
        //1
        /*str = str.toUpperCase(Locale.ROOT);
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }*/

        //2
        String tmp = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(tmp)) return "NO"; //대소문자 구분X

        return answer;
    }

    public static void main(String[] args) {
        Ex7 T = new Ex7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
