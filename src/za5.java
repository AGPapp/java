import java.util.Scanner;
public class za5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        double x = in.nextDouble();
        System.out.println("Введите число 2: ");
        double y = in.nextDouble();
        System.out.println("Введите оператор: ");
        String o = in.next();

        switch (o) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Мне не сосчитать");
        }

}}

