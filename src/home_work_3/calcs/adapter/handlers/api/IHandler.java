package home_work_3.calcs.adapter.handlers.api;

/**
 * Интерфейс для обработки математических выражений из String
 */
public interface IHandler {
    String handle (String expression);
    int getPriority();
}