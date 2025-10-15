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

    public static int calculateBalls(String userInput, List<Integer> computerNumbers) {
        int balls = 0;

        // 사용자 입력 숫자
        int[] userNumber = new int[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            int num = userInput.charAt(i) - '0';
            userNumber[i] = num;
        }

        // 볼 계산
        for (int i = 0; i < userInput.length(); i++) {
            // 컴퓨터 숫자에 포함되어 있으면서, 같은 자리에 위치하지 않는 경우(스트라이크 아닌 경우)
            if (computerNumbers.contains(userNumber[i]) && userNumber[i] != computerNumbers.get(i)) {
                balls++;
            }
        }

        return balls;
    }
}
