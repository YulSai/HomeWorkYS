package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс обработки  математических выражений из String для нахождения модуля числа
 */
public class AbsHandler implements IHandler {
    private final ICalculator calculator;
    public static final String ABS_PATTERN = "\\|";
    private final Pattern pattern;


    public AbsHandler(ICalculator calculator) {
        this.pattern = Pattern.compile("(.*)" + "(" + ABS_PATTERN + ".+" + ABS_PATTERN + ")+" + "(.*)");
        this.calculator = calculator;
    }

    @Override
    public String handle(String expression) {
        boolean isMatch;
        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatch = matcher.find();
            if (isMatch) {
                CalculatorAdapter calc = new CalculatorAdapter();
                String withoutAbs = matcher.group(2).substring(1, matcher.group(2).length() - 1);
                double temp = calc.calcFromAdapter(withoutAbs);
                temp = calculator.abs(temp);

                expression = expression.replace(matcher.group(2), String.valueOf(temp));
            }
        } while (isMatch);

        return expression;
    }

    @Override
    public int getPriority() {
        return 4;
    }
}


