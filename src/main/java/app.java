import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in= new Scanner(System.in);
        String strok = in.nextLine();
        String[] parts = strok.split(" ");
        int a;
        int b;
        try {
             a = Integer.parseInt(parts[0]);
             b = Integer.parseInt(parts[2]);
        }catch(NumberFormatException exception){
            System.out.println("введено не число");
            return;
        }
        switch (parts[1]) {
            case "+": {
                System.out.println(calculator.add(a, b));
                break;
            }
            case "-": {
                System.out.println(calculator.subtract(a, b));
                break;
            }
            case "*": {
                System.out.println(calculator.multiply(a, b));
                break;
            }
            case "/": {
                System.out.println(calculator.divide(a, b));
                // if(b==0) System.out.println("на 0 делить нельзя");
                // else System.out.println(a/b);
                // break;
            }
        }
    }
}
// case "+": {
//     System.out.println(a + b);
//     break;
// }