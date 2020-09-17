package com.company;

import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int m;
    private int n;

    public int[][] getMatrix(){
        return matrix;
    }

    public Matrix(int[][] matrix){
        for(int i=0; i<matrix.length-1; i++){
            if(matrix[i].length != matrix[i+1].length){
                throw new ArithmeticException();
            }
        }
        this.matrix = matrix;
    }
    public Matrix(){
        System.out.println("Введите кол во столбцов");
        Scanner scanner = new Scanner(System.in);
        this.n = scanner.nextInt();
        System.out.println("Введите количество строк: ");
        this.m = scanner.nextInt();
        this.matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++) {
                this.matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Готово");
    }

    public Matrix sumMatrix(Matrix other){
        if(m!= other.m && n != other.n){
            throw new ArithmeticException();
        }

        int[][] newMatrix = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                newMatrix[i][j] = matrix[i][j] + other.getMatrix();
            }
        }
        return new Matrix(newMatrix);

    }

    public Matrix defMatrix(Matrix other){
        if(m!= other.m && n != other.n){
            throw new ArithmeticException();
        }

        int[][] newMatrix = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                newMatrix[i][j] = matrix[i][j] - other.getMatrix();
            }
        }
        return new Matrix(newMatrix);

    }
}
