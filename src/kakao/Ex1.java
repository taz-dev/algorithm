package kakao;

public class Ex1 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append('L');
                left = numbers[i];

            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append('R');
                right = numbers[i];

            } else {
                if (numbers[i] == 0) numbers[i] = 11;
                int ld = Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;
                int rd = Math.abs(right - numbers[i]) / 3 + Math.abs(right - numbers[i]) % 3;

                if (ld == rd) {
                    if (hand.equals("left")) {
                        sb.append('L');
                        left = numbers[i];
                    } else {
                        sb.append('R');
                        right = numbers[i];
                    }
                } else if (ld < rd) {
                    sb.append('L');
                    left = numbers[i];

                } else if (ld > rd) {
                    sb.append('R');
                    right = numbers[i];
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        // int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // String hand = "right";
        System.out.println(ex.solution(numbers, hand)); // LRLLLRLLRRL
    }
}
