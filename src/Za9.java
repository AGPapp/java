import java.util.Scanner;
public class Za9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        double[] myArray = new double[in.nextInt()];
        double s = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Введите значение массива №"+ (i+1));
            myArray[i] = in.nextDouble() ;
            s = s + myArray[i] ;
        }
        double srar = s / myArray.length;
        for ( int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]* srar);
        }
    }
}
