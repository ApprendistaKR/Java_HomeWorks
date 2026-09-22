import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> list = new ArrayList<String>();
    String result;
    OperatorType oper = null;

    String calculator(int num1, int num2, String str) {
        if ((num1 <0)||(num2<0)){
            return ("양의 정수를 입력해 주세요");
        }
        switch (str) {
            case "+":
                oper = OperatorType.PLUS;{
                    break;
            }
            case "-":
                oper = OperatorType.MINUS;{
                    break;
            }
            case "*":
                oper = OperatorType.MULTIPLY;{
                    break;
            }
            case "/":
                oper = OperatorType.DIVIDE;{
                if (num2 == 0) {
                    return ("나눗셈 연산에서 분모(두번째 숫자)에는 0이 입력될 수 없습니다.");
                }
            break;

                }
        }


        result = String.valueOf(oper.Cal(num1, num2));
//        if((num1 < 0) && (num2 < 0)) {
//            this.result = ("음의 정수는 입력할 수 없습니다.");
//        } else if (c == '+') {
//            this.result = " " + (num1 + num2);
//        } else if (c == '-') {
//            this.result = " " + (num1 - num2);
//        } else if (c == '*') {
//            this.result = "" + (num1 * num2);
//        } else if ((c == '/') && (num2 != 0)) {
//            this.result = " " + (num1 / num2);
//        } else {
//            this.result = ("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없습니다");
//        }
        list.add(result);
        return result;
    }

    public ArrayList<String> getList() {

        return list;
    }

    public void setList(ArrayList<String> list) {

        this.list = list;
    }

    public void removeResult() {

        list.remove(0);
    }
}

