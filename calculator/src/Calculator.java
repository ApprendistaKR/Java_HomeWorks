import java.util.ArrayList;

public class Calculator {
    ArrayList<String> list = new ArrayList<String>();
    String result;

    String calculator(int num1, int num2, char c) {
        if (c == '+') {
            this.result = " " + (num1+num2);
        } else if (c == '-') {
            this.result = " "+ (num1-num2);
        } else if (c == '*') {
            this.result = "" + (num1*num2);
        } else if ((c == '/') && (num2 != 0)) {
            this.result = " " + (num1 / num2);
        } else {
            this.result = ("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다");
        }
        list.add(result);
        return result;
    }
}