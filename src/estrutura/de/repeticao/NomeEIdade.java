package estrutura.de.repeticao;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome="Escolha seu nome";
        int idade;

        while(!nome.equals("0")) {
            System.out.println("Nome: ");
            nome = scanner.next();
            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }

    }
}
