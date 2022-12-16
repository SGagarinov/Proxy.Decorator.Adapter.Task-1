package classes;

import interfaces.Ints;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public double sum(double arg0, double arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public double mult(double arg0, double arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public double pow(double a, double b) {
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
