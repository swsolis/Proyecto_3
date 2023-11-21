/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class Aplicacion {

    public static void main(String[] args) {
        Aplicacion.edades();
    }

    public static void tablaMultiplicar() {
        int num;
        String resp = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Pana ingresa un numero");
        num = leer.nextInt();
        for (int i = 1; i <= 12; i++) {
            resp = i + "*" + num + "=" + i * num;
            System.out.println(resp);
        }

    }

    public static void edades() {
        Scanner leer = new Scanner(System.in);
        int edades[] = new int[3];
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingresa la edad del estudiante: " + (i + 1));
            edades[i] = leer.nextInt();
        }

//        for (int i = 0; i < edades.length; i++) {
//            System.out.println("La edad del estudiante "+(i+1)+" es:"+edades[i]);
//        }
        int op = 0;
        do {
            System.out.println("Ingresa una opcion:\n"
                    + "1.- Mostrar valores de las edades\n"
                    + "2.- Calcular el promedio\n"
                    + "3.- Quien es el mayor\n"
                    + "4.- Quien es el menor\n"
                    + "5.- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println(Arrays.toString(edades));
                    break;
                case 2:
                    int acu=0;
                    double prom=1;
                    for (int i = 0; i < edades.length; i++) {
                        acu +=edades[i];
                        }
                    prom=acu/edades.length;
                        System.out.println("El promedio es:"+prom);
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Chao....!!");
                    break;
            }
        } while (op!=5);

    }

}
