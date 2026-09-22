import java.util.Scanner;

public class ArithmeticCalculator {
    public static void ArithemticCalculator(String[] args) {
        // 속성
        Arithmetic arith = Arithmetic.PLUS;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // 생성자
        int result = arith.Cal(num1, num2);
        System.out.println("결과:" + result);

        // 기능


    }
}
