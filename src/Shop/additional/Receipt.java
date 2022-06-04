package Shop.additional;

import java.util.List;

/**
 * Класс с описанием объекта Receipt
 */
public class Receipt {
    private final List<String> rows;
    private final double sum;

    public Receipt(List<String> rows, double sum) {
        this.rows = rows;
        this.sum = sum;
    }

    public List<String> getRows() {
        return rows;
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        for (String row : this.rows) {
            builder.append(++index)
                    .append(". ")
                    .append(row)
                    .append("\n");
        }

        builder.append("Сумма к оплате: ").append(sum);

        return builder.toString();
    }
}