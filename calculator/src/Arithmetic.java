public enum Arithmetic {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String arti;

    Arithmetic(String arti) {
        this.arti = arti;
    }
public int Cal(int num1, int num2){
        return switch (this){
            case PLUS -> num1 + num2;
            case MINUS -> num1 - num2;
            case MULTIPLY -> num1 * num2;
            case DIVIDE -> num1 / num2;
        };
    }

public String getArti(){
    return arti;
    }
}
