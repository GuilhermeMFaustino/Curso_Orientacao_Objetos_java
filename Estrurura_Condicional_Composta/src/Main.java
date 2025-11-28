import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.println("Qunatas Horas");
        hora = sc.nextInt();
        if(hora < 12){
            System.out.println("Bom dia ");
        }else{
            System.out.println("Boa Tarde");
        }


        sc.close();
    }
}