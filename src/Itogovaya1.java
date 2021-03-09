import java.util.Scanner;
public class Itogovaya1 {
    public static void main(String[] args) {
        System.out.print("Укажите текущий курс требуемой валюты: ");
        Scanner in = new Scanner(System.in);
        double kurs = in.nextDouble();
        System.out.print("Укажите количество рублей для конвертации: ");
        double rub = in.nextDouble();
        double kolvo = rub/kurs;
        String kolvot = Double.toString(kolvo);
        int x = kolvot.lastIndexOf('.');
        System.out.println("Итого: " + kolvot.substring(0, (x+3)));
;

    }
}