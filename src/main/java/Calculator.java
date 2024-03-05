import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    }
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Деление на ноль невозможно.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
