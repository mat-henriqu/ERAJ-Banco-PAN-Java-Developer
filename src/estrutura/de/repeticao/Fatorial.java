package estrutura.de.repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o numero que deseja ver o fatorial dele: ");
        int fatorial = scanner.nextInt();
        long multiplicacao=1;
        System.out.println("Fatorial de " + fatorial);
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao=multiplicacao*i;
        }
        System.out.printf("%d! = %d ",fatorial, multiplicacao);
    }
}
