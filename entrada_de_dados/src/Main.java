import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double d;
        char c;

        x = sc.next();
        y = sc.nextInt();
        d = sc.nextDouble();
        c = sc.next().charAt(0);

        System.out.println("voce digitou " + x);
        System.out.println("voce digitou o int " + y);
        System.out.printf("voce digitou o double %.2f%n", d);
        System.out.println("voce digitou o char " + c);
        sc.close();

    }

}