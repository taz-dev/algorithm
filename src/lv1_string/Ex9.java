package lv1_string;

import java.util.Scanner;

public class Ex9 {
    //1 아스키코드
    //0~9:48~57
    /*public int solution(String str){
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }*/

    //2
    public int solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer); //맨 앞에 0이 있을 경우 0을 없애줌
    }

    public static void main(String[] args){
        Ex9 T = new Ex9();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
