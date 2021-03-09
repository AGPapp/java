import java.util.Scanner;
public class Za8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int x =  in.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++){
            if (!(i%2 == 0)) {
                sum = sum + i;
        }
    }
        System.out.println("Сумма всех нечетных чисел от 1 до "+ x +"(включительно) = " +sum);
}}
