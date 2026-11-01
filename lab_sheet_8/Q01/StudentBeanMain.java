package lab_sheet_8.Q01;

public class StudentBeanMain {
    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setId(101);
        student.setName("Aarav");
        student.setGrade(91.5);

        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}
