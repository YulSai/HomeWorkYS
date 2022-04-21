package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
/**
 * Класс обработки математических выражений из String для нахождения числа Пи
 */
public class PIHandler extends PatternHandler implements IHandler {
    public static final String PI_PATTERN = "PI|pi";


    public PIHandler(ICalculator calculator) {
        super(PI_PATTERN);
    }

    @Override
    protected double calc(Matcher matcher) {
        return Math.PI;
    }

    @Override
    public int getPriority() {
        return 6;
    }
}