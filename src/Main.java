import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159265;
        System.out.print("1. Degree to Radian\n2. Degree to Rev\n3. Radian to Degree\n4. Radian to Rev\n5. Rev to degree\n6. Rev to Radian");
        System.out.print("Choose an Option: \r");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.print("Enter a Degree: \r");
            double Degree = scanner.nextDouble();
            double Radian = pi / 180 * Degree;
            System.out.println("Radian : " + Radian);
        } else {
            System.out.println("Invalid Number!");
        }
    }
}