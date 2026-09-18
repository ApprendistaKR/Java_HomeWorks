import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
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

            String result = cal.getCal(num1, num2, c);
            System.out.println(result);


            System.out.println("계속 계산하시겠습니까?\n(그만 두시려면 exit를, 계속하시려면 아무키나 입력해주세요)");
            str2 = sc.nextLine();
        }
    }
}
