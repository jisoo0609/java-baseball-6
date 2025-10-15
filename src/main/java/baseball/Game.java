package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

// 게임 상태 관리, 게임 루프 핵심
public class Game {
    private List<Integer> computerNumbers;

    // 게임 시작, 루프 실행, 재시작 종료 처리
    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        // 랜덤 숫자 생성
        generateComputerNumbers();

        // 게임 시작
        while (true) {
            // 한 턴 동안 사용자 입력 → 판정 → 결과 출력
            System.out.print("숫자를 입력해주세요 : ");
            String userInput = Console.readLine();

            // 입력 검증
            InputValidator.validate(userInput);

            // 판정 계산
            int strikes = ResultCalculator.calculateStrikes(userInput, computerNumbers);
            int balls = ResultCalculator.calculateBalls(userInput, computerNumbers);

            // 결과 출력
            OutputPrinter.outputPrint(strikes, balls);

            // 3스트라이크인지 체크
            if (strikes == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

                // 1 → 새 게임, 2 → 종료
                int input = Integer.parseInt(Console.readLine());
                if (input == 1) {
                    // 난수 새로 생성
                    generateComputerNumbers();
                } else {
                    break;
                }
            }
        }
    }

    // 난수 3개 생성 (1~9 중 중복 없이)
    private void generateComputerNumbers() {
        computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9); // 난수 생성
            // 만약 computerNumbers에 생성된 randomNumber가 없으면 추가
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
    }
}
