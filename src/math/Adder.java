package math;

public class Adder implements MathOperation {

    @Override
    public int calculate(int oper1, int oper2) {
        return oper1 + oper2;
    }
}
