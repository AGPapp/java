import java.util.Scanner;
public class za6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int vel = in.nextInt();
        if (vel == 1){
             System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стоун, 4 - пуд");
             int ed = in.nextInt();
             System.out.println("Введите число: ");
             double x = in.nextDouble();
             switch (ed){
                 case 1:
                     System.out.println("Кило: " + x);
                     System.out.println("Фунт: " + x * 2.205);
                     System.out.println("Cтоун: " + x / 6.35);
                     System.out.println("Пуд: " + x / 16.3804815);
                     break;
                 case 2:
                     double y = x / 2.205;
                     System.out.println("Кило: " + y);
                     System.out.println("Фунт: " + x );
                     System.out.println("Cтоун: " + y / 6.35);
                     System.out.println("Пуд: " + y / 16.3804815);
                     break;
                 case 3:
                     y = x * 6.35;
                     System.out.println("Кило: " + y);
                     System.out.println("Фунт: " + y * 2.205);
                     System.out.println("Cтоун: " + x);
                     System.out.println("Пуд: " + y / 16.3804815);
                     break;
                 case 4:
                     y = x * 16.3804815;
                     System.out.println("Кило: " + y);
                     System.out.println("Фунт: " + y * 2.205);
                     System.out.println("Cтоун: " + y / 6.35);
                     System.out.println("Пуд: " + x);
                     break;
                 default:
                     System.out.println("Меня задавило!!!");
             }}
        else if (vel == 2) {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int ed2 = in.nextInt();
                System.out.println("Введите число: ");
                double x = in.nextDouble();
                switch (ed2){
                    case 1:
                        System.out.println("Метров: " + x);
                        System.out.println("Миль: " + x / 1609);
                        System.out.println("Ярдов: " + x * 1.094);
                        System.out.println("Футов: " + x * 3.281);
                        break;
                    case 2:
                        System.out.println("Метров: " + x * 1609);
                        System.out.println("Миль: " + x );
                        System.out.println("Ярдов: " + x * 1760);
                        System.out.println("Футов: " + x * 5280);
                        break;
                    case 3:
                        System.out.println("Метров: " + x / 1.094);
                        System.out.println("Миль: " + x / 1760 );
                        System.out.println("Ярдов: " + x);
                        System.out.println("Футов: " + x * 3);
                        break;
                    case 4:
                        System.out.println("Метров: " + x / 3.281);
                        System.out.println("Миль: " + x / 5280);
                        System.out.println("Ярдов: " + x / 3);
                        System.out.println("Футов: " + x);
                        break;
                    default:
                        System.out.println("Меня растянуло!!!");
                }
             }
        else {
            System.out.println("Все сломалось");}
        }
    }
