import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase(Locale.ROOT);
        t = Character.toUpperCase(t);

        //1
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        //2
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) answer++;
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}
