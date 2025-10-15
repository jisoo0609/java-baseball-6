package baseball;

// 결과 메시지 출력
public class OutputPrinter {
    public static void outputPrint(int strikes, int balls) {
        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
        } else if (strikes == 0) {
            System.out.println(balls + "볼");
        } else if (balls == 0) {
            System.out.println(strikes + "스트라이크");
        } else {
            System.out.println(balls + "볼 " + strikes + "스트라이크");
        }
    }
}
