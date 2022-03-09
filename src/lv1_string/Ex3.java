package lv1_string;

import java.util.Scanner;

public class Ex3 {
    public String solution(String str) {
        String answer = "";
        //1
        /*int max = Integer.MIN_VALUE; //가장 작은 값으로 초기화(-2147483648)
        String[] arr = str.split(" "); //arr = {"It", "is", "time", "to", "study"}

        for (String x : arr) {
            int len = x.length();

            if (len > max) {
                max = len;
                answer = x;
            }
        }*/

        //2 indexOf(), substring()
        //indexOf()는 값을 찾고 그 결과로 숫자를 반환하는데 없는 경우 -1을 반환함
        //있는 경우 결과값으로 문자열의 시작위치에 해당하는 index를 반환해줌
        int max = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) { //str = "It is time to study"
            String tmp = str.substring(0, pos); //pos = 2, tmp = "It"
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); //str = "is time to study"
        }
        if (str.length() > max) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); //단어가 아닌 한 줄을 입력받을 때
       System.out.println(T.solution(str));
    }
}
