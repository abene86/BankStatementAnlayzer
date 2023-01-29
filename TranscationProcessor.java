import java.time.Month;
import java.util.*;

public class TranscationProcessor {
    private List<Transaction> listTrans;

    TranscationProcessor(List<Transaction> listTrans) {
        this.listTrans = listTrans;
    }

    public double calculateTotalAmount() {
        double total = 0d;
        for (Transaction trans : listTrans) {
            total += trans.getAmount();
        }
        return total;
    }

    public double calulateTotalAmountMonth(Month month) {
        double total = 0d;
        for (Transaction trans : listTrans) {
            if (trans.getDate().getMonth() == month) {
                total += trans.getAmount();
            }
        }
        return total;
    }

    public double calculateTotalAmountCategory(String category) {
        double total = 0d;
        for (Transaction trans : listTrans) {
            if (trans.getCompany().equalsIgnoreCase(category)) {
                total += trans.getAmount();
            }
        }
        return total;
    }
}
