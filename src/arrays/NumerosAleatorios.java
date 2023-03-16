package arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numAleat = new int[20];

        for (int i = 0; i < numAleat.length; i++) {
            int numero = random.nextInt(100);
            numAleat[i] = numero;
        }
        System.out.println("Numeros aleatorios gerados e seus sucessores abaixo ");
        for (int numero : numAleat) {
            System.out.println(numero + " " + (numero + 1));
        }

    }
}
