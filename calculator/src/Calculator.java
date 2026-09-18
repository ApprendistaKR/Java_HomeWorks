public class Calculator {
    public String calculator (int num1, int num2, char c) {
        if (c == '+') {
            return ("결과: " + (num1+num2) );
        } else if (c == '-') {
            return ("결과: " + (num1 - num2));
        } else if (c == '*') {
            return ("결과: " + (num1 * num2));
        } else if ((c == '/') && (num2 != 0)) {
            return ("결과: " + (num1 / num2));
        } else {
            return ("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다.");
        }
    }
}
