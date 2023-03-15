package estrutura.de.repeticao;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int quantidadeRepeticao;
        int numPar=0,numImpar=0,num;
        System.out.println("Digite a quantidade de numeros: ");
        quantidadeRepeticao = scanner.nextInt();

        for (int i =0 ; i<quantidadeRepeticao;i++){
            System.out.println("Digite um numero: ");
            num= scanner.nextInt();
            if(num%2==0){
                numPar++;
            }else {
                numImpar++;
            }
        }
        System.out.printf("A quantidade de numeros pares %d e a quando de numeros impares %d ",numPar,numImpar);
    }
}
