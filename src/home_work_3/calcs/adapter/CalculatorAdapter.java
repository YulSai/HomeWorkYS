package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс с адаптером для реализации расчета выражения, переданного в String
 */
public class CalculatorAdapter {
    private final List<IHandler> listHandler = new LinkedList<>(); // для сортировки по приоритету мат операций

    public CalculatorAdapter() {
        ICalculator calculator = new CalculatorWithMathExtends();

        listHandler.add(new PlusHandler(calculator));
        listHandler.add(new BracketsHandler(calculator));
        listHandler.add(new AbsHandler(calculator));
        listHandler.add(new PowHandler(calculator));
        listHandler.add(new DivHandler(calculator));
        listHandler.add(new AddHandler(calculator));
        listHandler.add(new MinusHandler(calculator));

        listHandler.sort((a, b) -> b.getPriority() - a.getPriority());
    }

    /**
     * метод для расчета выражения в виде строки
     * @param expression строка с математическим выражением
     * @return результат вычисления в double
     */
    public double calcFromAdapter(String expression) {
        for (IHandler handler : listHandler) {
            expression = handler.handle(expression);
        }
        return Double.parseDouble(expression);
    }
}