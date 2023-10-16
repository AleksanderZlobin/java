package Java_OOP.HW_7;

public class Controller {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);

        view.start();

    }
}
