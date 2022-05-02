package home_work_3.test;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {
    @Test
    public void calculateWithCalculatorWithOperator() {
        ICalculator calc = new CalculatorWithOperator();
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithMathCopy() {
        ICalculator calc = new CalculatorWithMathCopy();
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithMathExtends() {
        ICalculator calc = new CalculatorWithMathExtends();
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithCounterClassic() {
        ICalculator calc = new CalculatorWithCounterClassic();
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoSuper() {
        ICalculator calc = new CalculatorWithCounterAutoSuper();
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithCounterAutoDecorator() {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithOperator());
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }

    @Test
    public void calculateWithCalculatorWithMemoryDecorator() {
        ICalculator calc = new CalculatorWithMemoryDecorator(new CalculatorWithMathCopy());
        double correctRresult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2);

        double div = calc.div(28, 5);
        double pow = calc.pow(div, 2);
        double add = calc.add(15, 7);
        double plus = calc.plus(pow, add);
        double result = calc.plus(4.1, plus);

        Assertions.assertEquals(correctRresult, result);
    }
}
