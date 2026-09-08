package com.colegiomagico.reto5;

/**
 * Suma todos los números desde 1 hasta limite usando un ciclo while.
 */
public class ConteoMagico {

    public static int contar(int limite) {
        int suma = 0;       // Aquí acumulamos el total
        int actual = 1;     // Empezamos a contar desde el número 1

        // El bucle se repite sumando cada número hasta llegar al límite
        while (actual <= limite) {
            suma += actual; // Sumamos el número actual a la bolsa
            actual++;       // Pasamos al siguiente número
        }

        return suma; // Devolvemos el total acumulado
    }

    public static void main(String[] args) {
        System.out.println("Conteo hasta 4: " + contar(4));
    }
}
