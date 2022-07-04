import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159265;
        System.out.println("1. Degree to Radian\n2. Degree to Rev\n3. Radian to Degree\n4. Radian to Rev\n5. Rev to degree\n6. Rev to Radian");
        System.out.println("Choose an Option : \r");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Enter a Degree: \n");
            double Degree = scanner.nextDouble();
            double Radian = pi / 180 * Degree;
                System.out.printf("Radian %.2f\n", Radian);
        } else if (input == 2) {
            System.out.println("Enter a Degree: \r");
            double Degree = scanner.nextDouble();
            double Radian = pi / 180 * Degree;
            double Rev = Radian / (2 * pi);
            System.out.printf("Rev : %.2f", Rev);
        } else if (input == 3) {
            System.out.println("Enter a Radian: ");
            double Radian = scanner.nextDouble();
            double Degree = (180 / pi) * Radian;
            if (Degree - (int) Degree >= 0.5) {
                Degree++;
                System.out.println("Degree : " + (float) (int) Degree);
            } else {
                System.out.println("Degree : " + (int)Degree);
            }
        } else if (input == 4) {
            System.out.print("Enter a Radian : ");
            double Radian = scanner.nextDouble();
            double Rev = Radian / 2 * pi;
            System.out.printf("Rev : %.2f", Rev);
        } else if (input == 5) {
            System.out.println("Enter a Rev : ");
            double Rev = scanner.nextDouble();
            double Radian = Rev * 2 * pi;
            double Degree = (180 / pi) * Radian;
            if (Degree - (int) Degree >= 0.5) {
                Degree++;
                System.out.println("Degree : " + (float) (int) Degree);
            } else {
                System.out.println("Degree : " + (int) Degree);
            }
        } else if(input == 6) {
            System.out.println("Enter a Rev : ");
            double Rev = scanner.nextDouble();
            double Radian = Rev * (2 * pi);
            double Radpi = Radian / pi;
            System.out.printf("Rev : %.2f pi \n", Radpi);
            System.out.println("");
        } else {
            System.out.println("Invalid Number!");
        }
    }
}
