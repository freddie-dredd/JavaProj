package com.company;

import java.net.PortUnreachableException;

public class Vector {
    public static void main(String[] args) {

    }

    int[] cords = {2,5,7};
    int[] cords2 = {1,3,5};

    public Vector(int[] cords, int[] cords2) {
        this.cords = cords;
        this.cords2 = cords2;
    }

    //длина вектора
    public double leng(int[] cords) {
        int x = cords[0];
        int y = cords[1];
        int z = cords[2];

        return Math.sqrt(x*x + y*y + z*z);
    }

    //скалярное произведение

    public double vectScal(int[] cords) {
        int x = this.cords[0];
        int y = this.cords[1];
        int z = this.cords[2];

        int x2 = cords2[0];
        int y2 = cords2[1];
        int z2 = cords2[2];
        return x*x2 + y*y2 + z*z2;
    }

    //векторное произведение

    public int[] vectMultiply() {
        int x = cords[0];
        int y = cords[1];
        int z = cords[2];

        int x2 = cords2[0];
        int y2 = cords2[1];
        int z2 = cords2[2];

        return new int[]{y * z2 - z * y2, z * x2 - x * z2, x * y2 - y * x2};

    }

    public double ugol(){
        return Math.toDegrees(Math.acos(vectScal(cords) / (leng(cords) * leng(cords2))));
    }

    public int[] mathVector(char operation){
        int[] res = new int[2];
        if(operation == '+'){
            int x = cords[0];
            int y = cords[1];
            int z = cords[2];

            int x2 = cords2[0];
            int y2 = cords2[1];
            int z2 = cords2[2];

            res = new int[]{x + x2, y + y2, z + z2};
        }

        else if(operation == '-') {
            int x = cords[0];
            int y = cords[1];
            int z = cords[2];

            int x2 = cords2[0];
            int y2 = cords2[1];
            int z2 = cords2[2];

            res = new int[]{x - x2, y - y2, z - z2};
        }
    return res;
    }

}



