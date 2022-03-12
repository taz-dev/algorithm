package lv1_string;

import java.util.Scanner;

public class Ex9 {
    public int solution(String str){
        int answer = 0;

        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    public static void main(String[] args){
        Ex9 T = new Ex9();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
