import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите массу тела: ");
        float weight = in.nextLong();
        System.out.print("Введите рост: ");
        float hieght = in.nextLong();
        BmiService bmiService = new BmiService();
        float bmi = bmiService.calculate(weight, hieght);

        System.out.print("Индекс массы тела: " + String.format("%.2f", bmi));
    }
}
