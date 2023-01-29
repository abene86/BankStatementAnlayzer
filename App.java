import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BankStatementParser parser = new BankStatementCVSParser();
        BankStatementAnlayzer anly = new BankStatementAnlayzer();
        anly.anlayze(args[0], parser);
    }
}