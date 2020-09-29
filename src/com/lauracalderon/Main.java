package com.lauracalderon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = "Laura";
        int sumadecalificacion = 0;
        float promedio;
        int[] calificacion = new int[5];
        calificacion[0] = 100;
        calificacion[1] = 60;
        calificacion[2] = 90;
        calificacion[3] = 53;
        calificacion[4] = 91;
        for (int i=0; i<calificacion.length; i++){
            sumadecalificacion+=calificacion[i];
        }
        promedio=(sumadecalificacion/calificacion.length);
        System.out.println("Nombre del estudiante: "+nombre);
        System.out.println("Calificacion 1: "+calificacion[0]);
        System.out.println("Calificacion 2: "+calificacion[1]);
        System.out.println("Calificacion 3: "+calificacion[2]);
        System.out.println("Calificacion 4: "+calificacion[3]);
        System.out.println("Calificacion 5: "+calificacion[4]);
        System.out.println("Promedio: "+promedio);


        if (promedio<=50){
            System.out.println("Calificcacion: F");
        }else if (promedio>=51 && promedio <=60){
            System.out.println("Calificacion: E");
        }else if (promedio>=61 && promedio <=70){
            System.out.println("Calificacion: D");
        }else if (promedio>=71 && promedio <=80) {
            System.out.println("Calificacion: C");
        }else if (promedio>=81 && promedio <=90) {
            System.out.println("Calificacion: B");
        }else if (promedio>=91 && promedio <=100) {
            System.out.println("Calificacion: A");
        }else {
            System.out.println("No entras en el rango de calificacion");
        }
    }

}
