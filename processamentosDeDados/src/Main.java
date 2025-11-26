import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        Locale.setDefault(Locale.US);
        double o = 32;
        double b = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", b);
        System.out.printf("%.4f%n", b);
        System.out.println("RESULTADO = " + x +" METROS ");
        System.out.printf("RESULTADO =  %.2f metros%n", o);


        String nome = "maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


        double n, B, h, area;
        n = 6.0;
        B = 8.0;
        h = 5.0;
        area = (n + B) / 2.0 * h;
        System.out.println(area);
    }
}