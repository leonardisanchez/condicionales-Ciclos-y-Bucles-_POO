/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S02_10;

/**
 *
 * @author USUARIO
 */
public class S02_10_Array2 {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elemento en la posición 0: " + numeros[0]);
        System.out.println("Elemento en la posición 1: " + numeros[1]);
        System.out.println("Elemento en la posición 2: " + numeros[2]);
        System.out.println("Elemento en la posición 3: " + numeros[3]);
        System.out.println("Elemento en la posición 4: " + numeros[4]);

        int tamaño = numeros.length;
        System.out.println("El tamaño del array es: " + tamaño);
    }
}
