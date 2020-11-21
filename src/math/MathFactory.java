package math;

public class MathFactory {
    public enum MathOperationType {MULTIPLIER, ADDER };

    public MathOperation createMathOperation (int MathOperType) {
        if(MathOperType == 0)
            return new Adder();
        else if(MathOperType == 1)
            return new Multiplier(44, 1);
        return null;
    }


    public MathOperation createMathOperation (MathOperationType mathOperType) {
        if(mathOperType == MathOperationType.MULTIPLIER)
            return new Multiplier(5, 2);
        else if(mathOperType == MathOperationType.ADDER)
            return new Adder();
        return null;
    }

    public static void main(String[] args){
        MathFactory mc = new MathFactory();
        mc.createMathOperation(0);
        mc.createMathOperation(1);
    }
}
