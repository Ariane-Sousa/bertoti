import java.util.Scanner;

public class TestaSistemaCasaInteligente {
    public static void main(String[] args) {
        SistemaCasaInteligente sistemaCasa = new SistemaCasaInteligente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para ligar a casa ou 2 para desligar:");
        int input = scanner.nextInt();

        if (input == 1) {
            sistemaCasa.ligarCasa();
        } else if (input == 2) {
            sistemaCasa.desligarCasa();
        } else {
            System.out.println("Entrada inválida");
        }
    }
}