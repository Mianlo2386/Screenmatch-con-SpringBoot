package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Luz","Lila","Danu","Echi","Miguel");

        nombres.stream()
                .sorted()
                .limit(4)
                .filter(n->n.startsWith("E"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);

    }
}
