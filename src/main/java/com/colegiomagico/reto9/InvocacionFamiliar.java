package com.colegiomagico.reto9;

/**
 * Retorna una cadena formateada: 'Familiar: [tipo] llamado [nombre]'.
 */
public class InvocacionFamiliar {

    public static String invocar(String nombre, String tipo) {

        String resultado = String.format("Familiar: %s llamado %s", tipo, nombre);


        return resultado; // TODO: Cambia esto
    }

    public static void main(String[] args) {
        System.out.println(invocar("Hedwig", "Lechuza"));
    }
}
