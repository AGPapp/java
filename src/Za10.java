import java.util.Scanner;
public class Za10 {
    public static void main(String[] args) {
        System.out.println("Укажите размерность массива: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Индекс х: ");
        int x = in.nextInt();
        System.out.print("Индекс y: ");
        int y = in.nextInt();
        double[][] myArray = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Укажите значение " + (j + 1) + " строки " + (i + 1) + ": ");
                myArray[i][j] = in.nextDouble();
            }
        }
        for (int i = 0; i<y;i++){
            System.out.println(myArray[0][i]*3);
        }

    }
}
