import java.util.Scanner;
public class itogovaya3 {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String[] myArr = new String[x];
        int[] count = new int[x];

        for (int i = 0; i < myArr.length; i++ ){
            System.out.print("Введите строку "+(i+1)+":" );
            myArr[i] = in.next();}
        for (int x1 = 0; x1 < myArr.length; x1++){
            int g = 0;
            char[] charArr = myArr[x1].toCharArray();
            for(int a = 0; a < charArr.length; a++){
                 for(int b = 0; b < charArr.length;b++) {
                     if (charArr[a] != charArr[b]) {
                         g++;
                        }
                 }
            count[x1] = g;
            }}
        int max = count[0];
        int f = 0;
        for(int i2 = 0; i2 <count.length; i2++){
            if (count[i2] > max) { max = count[i2];
                f = i2;}
        }
        System.out.println(myArr[f]);
}}
