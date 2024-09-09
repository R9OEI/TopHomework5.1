import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите количество метров: ");
        Scanner scan = new Scanner(System.in);
        int meters = scan.nextInt();
        System.out.println("В какие единицы перевести? ");
        System.out.println("мили, введите 1");
        System.out.println("дюймы, введите 2");
        System.out.println("ярды, введите 3");
        int action = scan.nextInt();
        if(action == 1){
            double miles = meters * 0.0006214;
            System.out.println("В " + meters + " метрах " + miles + " миль");
        }
        if (action == 2){
            double inch = meters * 39.3701;
            System.out.println("В " + meters + " метрах " + inch + " дюймов");
        }
        if (action == 3){
            double yards = meters * 1.0936;
            System.out.println("В " + meters + " метрах " + yards + " ярдов");
        }
    }
}
