package com.colegiomagico.reto8;

import java.util.stream.Collectors;

/**
 * Filtra la lista de ingredientes devolviendo solo aquellos que empiezan con 'A'.
 */
public class InventarioPociones {

    public static java.util.List<String> filtrar(java.util.List<String> ingredientes) {

        java.util.List<String> filtered = ingredientes.stream()
                .filter(ingrediente -> ingrediente.startsWith("A"))
                .collect(Collectors.toList());
    
        return new java.util.ArrayList<>(filtered); // TODO: Cambia esto
    }


    public static void main(String[] args) {
        java.util.List<String> lista = java.util.Arrays.asList("Ajenjo", "Miel");
        System.out.println("Filtrados: " + filtrar(lista));
    }
}
