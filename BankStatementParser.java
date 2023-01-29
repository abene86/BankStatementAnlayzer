import java.util.List;

public interface BankStatementParser {
    Transaction parseFrom(String Line);

    List<Transaction> parseLinesFrom(List<String> lines);
}
