package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
        switch (casa) {
            case "Gryffindor":
                casa="Valentia";
                break;
            case "Ravenclaw":
                casa="Inteligencia";
                break;
            case "Muggle":
                casa="Desconocido";
                break;
            default:
                break;
        }

        return casa;
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
