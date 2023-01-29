import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private double amount;
    private String company;

    Transaction(LocalDate date, double amount, String company) {
        this.date = date;
        this.amount = amount;
        this.company = company;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCompany() {
        return this.company;
    }
}
