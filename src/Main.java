import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159265;
        System.out.println("1. Degree to Radian\n2. Degree to Rev\n3. Radian to Degree\n4. Radian to Rev\n5. Rev to degree\n6. Rev to Radian");
        System.out.println("Choose an Option: \r");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Enter a Degree: \r");
            double Degree = scanner.nextDouble();
            double Radian = pi / 180 * Degree;
            System.out.println("Radian : " + Radian);
        } else if (input == 2) {
            System.out.println("Enter a Degree: \r");
            double Degree = scanner.nextDouble();
            double Radian = pi / 180 * Degree;
            double Rev = Radian / (2 * pi);
            System.out.println("Rev : " + Rev);
        } else if (input == 3) {
            System.out.println("Enter a Radian: \r");
            double Radian = scanner.nextDouble();
            double Degree = (180 / pi) * Radian;
            System.out.println("Degree : " + Degree);
        }else {
            System.out.println("Invalid Number!");
        }
    }
}
