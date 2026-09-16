import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해주세요.");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력해주세요.");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요.");
        String str = sc.nextLine();
        char c = str.charAt(0);



        if(c == '+'){
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

    }
}
