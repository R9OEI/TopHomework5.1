import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите количество часов: ");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        if(hours >= 0 && hours < 6){
            System.out.println("Good Night");
        }
        if(hours >= 6 && hours < 13){
            System.out.println("Good Morning");
        }
        if(hours >= 13 && hours < 17){
            System.out.println("Good Day");
        }
        if(hours >= 17 && hours < 0){
            System.out.println("Good Evening");
        }
    }
}
