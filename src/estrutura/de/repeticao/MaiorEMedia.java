package estrutura.de.repeticao;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, maior = 0, media = 0, soma = 0;

        for (int i = 1; i<=5 ; i ++){
            System.out.println("Digite o "+i+" ° numero: ");
            num = scanner.nextInt();
            if(num>maior) maior=num;
            soma = soma + num;
        }
        media=soma/5;
        System.out.printf("O maior numero digitado foi %.2f e a media entre esses numeros e: %.2f",maior,media);
    }
}
