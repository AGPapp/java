import java.util.Scanner;
public class Za11 {
    public static void main(String[] args) {
        System.out.println("Ввести первое  число для str: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Ввести второе  число для int: ");
        int i = in.nextInt();
        int max = Math.max(Integer.parseInt(str),  i);
        double min = Math.min(Integer.parseInt(str),  i);;
        System.out.println("Из введенного больше - "+ max);
        System.out.println("Из введенного меньше - "+ min);



    }
}