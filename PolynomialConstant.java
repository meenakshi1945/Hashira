import java.util.Scanner;
public class PolynomialConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of the polynomial: ");
        int degree = scanner.nextInt();

        double productOfRoots = 1;
        System.out.println("Enter the roots (each separated by a newline):");
        for (int i = 0; i < degree; i++) {
            double root = scanner.nextDouble();
            productOfRoots *= root;
        }
        double constantTerm = Math.pow(-1, degree) * productOfRoots;

        System.out.println("The constant term of the polynomial is: " + constantTerm);

        scanner.close();
    }
}
