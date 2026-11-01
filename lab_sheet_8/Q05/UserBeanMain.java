package lab_sheet_8.Q05;

public class UserBeanMain {
    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setPassword("changeMe123");
        System.out.println("Password was set: " + user.hasPassword());
    }
}
