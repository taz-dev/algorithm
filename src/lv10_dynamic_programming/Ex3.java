package lv10_dynamic_programming;

import java.util.Scanner;

public class Ex3 {
    static int[] dy;
    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0; //π0μΌλ‘ μ΄κΈ°ν νλ μ΄μ π
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1; //μμ ν­λ€ μ€μμ μμ λ³΄λ€ ν° μκ° μμΌλ©΄ κΈΈμ΄κ° 1
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex3 T = new Ex3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
