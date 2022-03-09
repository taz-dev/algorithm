import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : arr) {
            //1
            /*String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);*/

            //2
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String str = String.valueOf(c);
            answer.add(str);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4 T = new Ex4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }
        for (String x : T.solution(n, arr)) {
            System.out.println(x);
        }
    }
}
