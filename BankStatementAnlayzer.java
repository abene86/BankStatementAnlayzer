import java.io.IOException;
import java.nio.file.*;
import java.time.Month;
import java.util.*;

public class BankStatementAnlayzer {
    public void anlayze(String fileName, BankStatementParser parser) throws IOException {
        final String filePath = "./" + fileName;
        final Path path = Paths.get(filePath);
        final List<String> lines = Files.readAllLines(path);
        List<Transaction> listTrans = parser.parseLinesFrom(lines);
        TranscationProcessor processor = new TranscationProcessor(listTrans);
        collectSummary(processor);
    }

    public static void collectSummary(TranscationProcessor processor) {
        System.out.println("The total profit " + processor.calculateTotalAmount());
        System.out.println("The total in the month of january is " + processor.calulateTotalAmountMonth(Month.JANUARY));
        System.out
                .println("The total in the month of january is " + processor.calulateTotalAmountMonth(Month.FEBRUARY));
        System.out.println("The total salary recieved is " + processor.calculateTotalAmountCategory("Salary"));
    }

}