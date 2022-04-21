package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
/**
 * Класс обработки математических выражений из String для нахождения экспоненты
 */
public class EHandler extends PatternHandler implements IHandler {
    public static final String E_PATTERN = "E|e";


    public EHandler(ICalculator calculator) {
        super(E_PATTERN);
    }

    @Override
    protected double calc(Matcher matcher) {
        return Math.E;
    }

    @Override
    public int getPriority() {
        return 6;
    }
}