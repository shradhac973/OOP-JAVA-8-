package lab_sheet_8.Q09;

public class CarBeanMain {
    public static void main(String[] args) {
        CarBean car = new CarBean();
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2024);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
