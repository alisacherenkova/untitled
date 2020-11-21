package math;


public class Multiplier implements MathOperation {
    int s;
    int c;
    public Multiplier(int n, int m) {
        this.s =n;
        this.c = m;
    }

    @Override
    public int calculate(int oper1, int oper2) {
        return oper1 * oper2;
    }
}
