import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankStatementCVSParser implements BankStatementParser {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Transaction parseFrom(String line) {
        String[] column = line.split(",");
        LocalDate parsedDate = LocalDate.parse(column[0], formatter);
        double amount = Double.parseDouble(column[1]);
        return new Transaction(parsedDate, amount, column[2]);
    }

    public List<Transaction> parseLinesFrom(List<String> fileContent) {
        List<Transaction> listTrans = new ArrayList<>();
        for (String row : fileContent) {
            listTrans.add(parseFrom(row));
        }
        return listTrans;
    }
}
