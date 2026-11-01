package lab_sheet_8.Q06;

public class AccountListenerMain {
    public static void main(String[] args) {
        AccountBean account = new AccountBean(500);
        account.addPropertyChangeListener(event ->
                System.out.println("Balance changed from " + event.getOldValue()
                        + " to " + event.getNewValue()));
        account.setBalance(750);
    }
}
