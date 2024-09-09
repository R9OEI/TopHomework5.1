import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        while (true){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scan.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scan.nextInt();
        System.out.println("Максимальное из трёх чисел, введите 1");
        System.out.println("Минимальное из трёх чисел, введите 2");
        System.out.println("Среднее арифметическое, введите 3");
        int action = scan.nextInt();
        if(action == 1){
            if(number1 >= number2 && number1 >= number3){
                System.out.println("Максимальное число: " + number1);
            }
            if(number2 >= number1 && number2 >= number3){
                System.out.println("Максимальное число: " + number2);
            }
            if (number3 >= number1 && number3 >= number2){
                System.out.println("Максимальное число: " + number3);
            }
        }
        if(action == 2){
            if(number1 <= number2 && number1 <= number3){
                System.out.println("Минимальное число: " + number1);
            }
            if(number2 <= number1 && number2 <= number3){
                System.out.println("Минимальное число: " + number2);
            }
            if (number3 <= number1 && number3 <= number2){
                System.out.println("Максимальное число: " + number3);
            }
        }
        if(action == 3) {
            int summa = number1 + number2 + number3;
            System.out.println("Среднее арифметическое равно: " + summa / 3);
        }
        }
    }
}
