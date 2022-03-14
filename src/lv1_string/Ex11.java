package lv1_string;

import java.util.Scanner;

public class Ex11 {
    public String solution(String str){
        String answer = "";

        str = str + " "; //str = "KKHSSSSSSSE ";
        int cnt = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;

            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        return answer; //K2HS7E
    }

    public static void main(String[] args){
        Ex11 T = new Ex11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
