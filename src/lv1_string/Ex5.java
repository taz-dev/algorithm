package lv1_string;

import java.util.Scanner;

public class Ex5 {
    public String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr); //char배열을 String으로 변환
        return answer;
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
