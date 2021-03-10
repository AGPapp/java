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
            char[] slovo = arr[i].toCharArray();
            //System.out.println("slovo"+slovo.length);
            int r = 0;
            for (int z = 0; z < slovo.length; z++){
                for(int w = 0; w < lang.length; w++){
                    if (Character.toLowerCase(slovo[z]) == lang[w]) {
                    r++; }
                }
                if (r == slovo.length){System.out.println(arr[i]);
                    mass++;
               }}
            }
        System.out.println(mass);
            }
    }

