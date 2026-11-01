package lab_sheet_8.Q07;

public class AccountChangeMain {
    public static void main(String[] args) {
        AccountBean account = new AccountBean(1200);
        account.addPropertyChangeListener(event ->
                System.out.println(event.getPropertyName() + " changed: "
                        + event.getOldValue() + " -> " + event.getNewValue()));

        account.setBalance(1500);
        System.out.println("Current balance: " + account.getBalance());
    }
}
