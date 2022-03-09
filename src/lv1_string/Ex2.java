package lv1_string;

import java.util.Scanner;

public class Ex2 {
    public String solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            //1
            /*if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);*/

            //2 아스키코드
            //A~Z:65~90, a~z:97~122
            if (x >= 65 && x <= 90) answer += (char)(x+32);
            else answer += (char)(x-32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex2 T = new Ex2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
