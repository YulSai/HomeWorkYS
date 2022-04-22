package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.CalculatorAdapter;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Класс обработки математических скобок из выражения из String
 */
public class BracketsHandler implements IHandler {
    public static final String OPENBRACKETS_PATTERN = "\\(";
    public static final String CLOSEBRACKETS_PATTERN = "\\)";
    private final Pattern pattern;

    public BracketsHandler(ICalculator calculator) {
        this.pattern = Pattern.compile("(.*)" + "(" + OPENBRACKETS_PATTERN + ".+" + CLOSEBRACKETS_PATTERN + ")+" + "(.*)");
    }

    @Override
    public String handle(String expression) {
        boolean isMatch;
        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatch = matcher.find();
            if (isMatch) {
                CalculatorAdapter calc = new CalculatorAdapter();
                String withoutBrackets = matcher.group(2).substring(1, matcher.group(2).length() - 1);
                String temp = String.valueOf(calc.calcFromAdapter(withoutBrackets));
                expression = expression.replace(matcher.group(2), temp);
            }
        } while (isMatch);

        return expression;
    }

    @Override
    public int getPriority() {
        return 5;
    }
}