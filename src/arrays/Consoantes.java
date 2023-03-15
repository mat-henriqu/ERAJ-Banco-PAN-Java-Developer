package arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;
        int cont = 0;
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();
            if (!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){
                consoantes[cont]=letra;
                quantidadeConsoante++;
            }
            cont++;
        } while (cont < consoantes.length);
        System.out.println("Consoantes Digitadas Abaixo");
        for (String consoante :
             consoantes) {
           if (consoante != null) {
               System.out.println(consoante);
           }
        }
        System.out.println("Quantidade de consoante digitada foi: "+quantidadeConsoante);

    }
}
