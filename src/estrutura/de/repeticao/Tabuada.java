package estrutura.de.repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite o numero que deseja que seja calculada a tabuada: ");
        num= scanner.nextInt();
        System.out.println("Tabuada de: "+num);
        for (int i=1;i<=10;i++){
            System.out.printf(" %d X %d = %d \n",num,i,(num*i));
        }

    }
}
