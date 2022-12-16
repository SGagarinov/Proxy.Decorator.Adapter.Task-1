import classes.Calculator;
import classes.IntsCalculator;
import interfaces.Ints;

public class Main {
    public static void main(String[] args) {
        //Оригинал
        Calculator calc = new Calculator();
        System.out.println("Sum: " +
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(2)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );
        System.out.println("Mult: " +
                calc.newFormula()
                        .addOperand(10)
                        .addOperand(22)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        System.out.println("Pow: " +
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(10)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );

        //Адаптер для калькулятора
        Ints intsCalc = new IntsCalculator();
        System.out.println("Sum:" + intsCalc.sum(2, 2));
        System.out.println("Mult: " + intsCalc.mult(10, 22));
        System.out.println("Pow: " + intsCalc.pow(2, 10));
    }
}
