package arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] m = new int[4][4];

        for (int i = 0 ; i < m.length ; i++){
            for (int j = 0 ; j < m.length ; j++ ){
                m[i][j]=random.nextInt(9);
            }
        }
        System.out.println("Matriz 4x4 abaixo ");
        for (int[] coluna : m) {
            for (int linha : coluna ) {
                System.out.print(linha + " ");
            }
            System.out.println();
        }

    }
}
