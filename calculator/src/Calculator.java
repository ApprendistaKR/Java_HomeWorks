import java.util.ArrayList;

public class Calculator {
    private ArrayList<String> list = new ArrayList<String>();
    String result;
    Arithmetic arith = null;

    String calculator(int num1, int num2, String str) {
        if ((num1 <0)||(num2<0)){
            return ("양의 정수를 입력해 주세요");
        }
        switch (str) {
            case "+":
                arith = Arithmetic.PLUS;{
                    break;
            }
            case "-":
                arith = Arithmetic.MINUS;{
                    break;
            }
            case "*":
                arith = Arithmetic.MULTIPLY;{
                    break;
            }
            case "/":
                arith = Arithmetic.DIVIDE;{
                if (num2 == 0) {
                    return ("나눗셈 연산에서 분모(두번째 숫자)에는 0이 입력될 수 없습니다.");
                }
            break;

                }
        }

        result = String.valueOf(arith.Cal(num1, num2));

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

