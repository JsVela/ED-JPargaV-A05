/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a05;

import java.util.Scanner;

/**
 *
 * @author JESUS PARGA VELA
 */
public class AlgoritmoOrdSeleccion {
    //Atributos
    protected int[] vector;
    int aux;
    Scanner s = new Scanner(System.in);
    int i = 0;
    int m = 0;
    int j = 0;
    int pos = 0;
    //Métodos
    public void seleccion() {
        System.out.println("Dime el tamaño del vector: ");
        int n = s.nextInt();
        vector = new int[n];
        System.out.println("Dame los valores para el vector: ");
        for (int pos = 0; pos < vector.length; pos++) {
            vector[pos] = s.nextInt();
        }
        for (pos = 0; pos < vector.length; pos++) {
            System.out.print("[" + vector[pos] + " ]  ");
        }
        for (i = 0; i < vector.length - 1; i++) {
            m = i;//Apuntador

            for (j = i + 1; j < vector.length; j++) {

                if (vector[j] < vector[m]) {
                    m = j;
                }
            }
            aux = vector[i];
            vector[i] = vector[m];
            vector[m] = aux;
        }
        System.out.println("");
        for (pos = 0; pos < vector.length; pos++) {
            System.out.print("[" + vector[pos] + " ]  ");
        }
    }
}
