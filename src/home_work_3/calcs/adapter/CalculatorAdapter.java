package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Класс с адаптером для реализации расчета выражения, переданного в String
 */
public class CalculatorAdapter {
    private final ICalculator calculator;
    private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>((a, b)
            -> b.getPriority() - a.getPriority());

    public CalculatorAdapter() {
        this.calculator = new CalculatorWithMathExtends();
        queueHandler.add(new PIHandler(this.calculator));
        queueHandler.add(new EHandler(this.calculator));
        queueHandler.add(new BracketsHandler(this.calculator));
        queueHandler.add(new AbsHandler(this.calculator));
        queueHandler.add(new PowHandler(this.calculator));
        queueHandler.add(new DivHandler(this.calculator));
        queueHandler.add(new AddHandler(this.calculator));
        queueHandler.add(new MinusHandler(this.calculator));
        queueHandler.add(new PlusHandler(this.calculator));
    }

    /**
     * метод для расчета выражения в виде строки
     * @param expression строка с математическим выражением
     * @return результат вычисления в double
     */
    public double calcFromAdapter(String expression) {
        for (IHandler handler : queueHandler) {
            expression = handler.handle(expression);
        }
        return Double.parseDouble(expression);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorAdapter that = (CalculatorAdapter) o;
        return Objects.equals(calculator, that.calculator) && Objects.equals(queueHandler, that.queueHandler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculator, queueHandler);
    }
}