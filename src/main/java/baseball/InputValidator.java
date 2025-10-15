package baseball;

// 사용자 입력 검증, 예외 처리
public class InputValidator {
    public static void validate(String input) {
        checkLength(input);
        checkDigits(input);
        checkRange(input);
        checkDuplicate(input);
    }

    public static void checkLength(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("입력 길이가 3이 아닙니다.");
        }
    }

    public static void checkDigits(String input) {
        if (!input.matches("[0-9]+")) {
            throw new IllegalArgumentException("숫자가 아닌 문자가 포함되어 있습니다.");
        }
    }

}
