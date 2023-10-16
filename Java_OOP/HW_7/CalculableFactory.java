package Java_OOP.HW_7;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int argReal, int argImaginary) {
        return new Calculator(argReal, argImaginary);
    }
}
