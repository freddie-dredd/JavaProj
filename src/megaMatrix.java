package com.company;

public class megaMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int[][] matrix2 = new int[5][5];
        matrix[0][1] = 34;
        matrix[2][3] = 12;
        matrix2[0][1] = 6;
        matrix2[2][3] = 8;

        printMatrix(matrix);
        printMatrix(sum(matrix, matrix2, '+'));
        printMatrix(sum(matrix, matrix2, '-'));

        printMatrix(multiplyToNumber(matrix, 3));
        printMatrix(matrixTransp(matrix));

    }

    // Пункт а. Сложене и вычитание матриц
    public static int[][] sum (int[][] array, int[][] array2, char todo){
        int[][] res = new int[array.length][array2.length];

        if(array.length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if(todo == '+') res[i][j] = array[i][j] + array2[i][j];
                    else if (todo == '-') res[i][j] = array[i][j] - array2[i][j];
                }
            }
        }
    return res;
    }

    public static int[][] multiplyToNumber (int[][] array, int number) {
        int[][] res = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                res[i][j] = array[i][j] * number;
            }
        }
        return res;
    }


    //Печать МаТрИцы
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }


    //Транспонированная матрица
    public static int[][] matrixTransp (int[][] matrix){
        int[][] res = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                res[i][j] = matrix[j][i];
            }

        }
        return res;
    }

    public static int[][] matrixMultiply (int[][] matrix1, int[][] matrix2) {
        int[][] res = new int[matrix1.length][matrix2.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                int temp = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    temp += matrix1[i][k] * matrix2[k][j];
                }
            res[i][j] = temp;
            }
        }
        return res;
    }

}
