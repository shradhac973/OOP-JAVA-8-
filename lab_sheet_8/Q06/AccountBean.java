package lab_sheet_8.Q06;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private final PropertyChangeSupport changes = new PropertyChangeSupport(this);
    private double balance;

    public AccountBean() {
    }

    public AccountBean(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        double oldBalance = this.balance;
        this.balance = balance;
        changes.firePropertyChange("balance", oldBalance, balance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changes.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changes.removePropertyChangeListener(listener);
    }
}
