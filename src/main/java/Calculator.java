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

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }
    public Integer tem (String strok){
        String[] parts = strok.split(" ");
        // int a = Integer.parseInt(parts[0]);
        // int b = Integer.parseInt(parts[2]);
        int res= 0;
        int a= 0;
        int b= 0;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        }catch(NumberFormatException exception){
            System.out.println("введено не число");
        }
        switch (parts[1]) {
            case "+": {
                res = add(a,b);
                break;
            }
            case "-": {
                res = subtract(a,b);
                break;
            }
            case "*": {
                res = multiply(a,b);
                break;
            }
            case "/": {
                // if(b==0) System.out.println("на 0 делить нельзя");
                // else{
                // res = a/b;
                // mystring = Integer.toString(res);}
                // break;
                res = divide(a,b);
                break;
            }
        }
    return res;
    }
}
