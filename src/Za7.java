import java.util.Scanner;
public class Za7 {
    public static void main(String[] args) {
        String x = "100500";
        String y = "1";
        String z = "Java";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        String[] myArray = new String[in.nextInt()];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Введите значение массива №"+ (i+1));
            myArray[i] = in.next();
        }
        for (int i = 0; i<myArray.length; i++){
           if  (myArray[i].equals(x) ||  myArray[i].equals(y) || myArray[i].equals(z) ){
                System.out.println("Данное значение имеется в константах: " + myArray[i]);
            }
          }
        }
    }

