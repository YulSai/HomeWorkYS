package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
/**
 * Класс обработки математических выражений из String для нахождения степени числа
 */
public class PowHandler extends PatternHandler implements IHandler {
    private final ICalculator calculator;

    public PowHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + "* \\^ *" + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.pow(Double.parseDouble(operand1), Integer.parseInt(operand2));
    }

    @Override
    public int getPriority() {
        return 3;
    }
}