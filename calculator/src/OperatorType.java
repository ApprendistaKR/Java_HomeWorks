public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String arti;

    OperatorType(String arti) {
        this.arti = arti;
    }
public int cal(int num1, int num2){
        return switch (this){
            case PLUS -> num1 + num2;
            case MINUS -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> num1 / num2;
        };
    }

}
