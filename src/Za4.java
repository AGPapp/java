import java.util.Scanner;
public class Za4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = in.nextInt();
        System.out.println("Введите y: ");
        int y = in.nextInt();
        System.out.println("Введите z: ");
        int z = in.nextInt();
        double sum = x + y + z;
        System.out.println(sum / 3);
        double round = (Math.floor((sum / 3)/2));
        System.out.println(round);
        if (round > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }

}
