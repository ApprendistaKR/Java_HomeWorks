import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str2 = "";
        while (!str2.equals("exit")) {

            System.out.print("첫 번째 숫자를 입력해주세요.");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력해주세요.");
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요.");
            String str = sc.nextLine();
            char c = str.charAt(0);

            if (c == '+') {
                System.out.println("결과: " + (num1 + num2));
            } else if (c == '-') {
                System.out.println("결과: " + (num1 - num2));
            } else if ((c == '*') && (num2 != 0)) {
                System.out.println("결과: " + (num1 * num2));
            } else if ((c == '/') && (num2 != 0)) {
                System.out.println("결과: " + (num1 / num2));
            } else {
                System.out.println("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
            }
            System.out.println("계속 계산하시겠습니까?\n(그만 두시려면 exit를, 계속하시려면 아무키나 입력해주세요)");
            str2 = sc.nextLine();
        }

    }
}
