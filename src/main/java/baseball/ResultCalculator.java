package baseball;

import java.util.List;

// 스트라이크/볼/낫싱 계산
public class ResultCalculator {
    public static int calculateStrikes(String userInput, List<Integer> computerNumbers) {
        int strikes = 0;

        // 사용자 입력 숫자
        int[] userNumber = new int[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            int num = userInput.charAt(i) - '0';
            userNumber[i] = num;
        }

        // 스트라이크 계산
        for (int i = 0; i < userInput.length(); i++) {
            if (userNumber[i] == computerNumbers.get(i)) {
                strikes++;
            }
        }

        return strikes;
    }

//    public static int calculateBalls(String userInput, List<Integer> computerNumbers) {
//    }
}
