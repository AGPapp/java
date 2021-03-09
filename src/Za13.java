import java.util.Scanner;
public class Za13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова, разделенные пробелами: ");
        String str = in.nextLine();
        String[] arr =  str.split(" ");
        String l = "abcdefghijklmnopqrstuvwxyz";
        int mass = 0;
        char[] lang = l.toCharArray();
        for (int i = 0; i < arr.length; i++){
            char t = Character.toLowerCase(arr[i].charAt(0));
            for (int z = 0; z < lang.length; z++){
              char s = lang[z];
                if (t == s) {
                    System.out.println(arr[i]);
                    mass++;
                }
               }
            }
System.out.println(mass);


    }
}
