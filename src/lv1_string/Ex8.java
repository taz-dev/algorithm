package lv1_string;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public String solution(String str){
        String answer = "NO";

        str = str.toUpperCase(Locale.ROOT).replaceAll("[^A-Z]", "");
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Ex8 T = new Ex8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
