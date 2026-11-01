package lab_sheet_8.Q05;

public class UserBean {
    private String password;

    public UserBean() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean hasPassword() {
        return password != null && !password.isEmpty();
    }
}
