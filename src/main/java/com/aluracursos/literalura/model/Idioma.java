package com.aluracursos.literalura.model;

import java.util.List;

public enum Idioma {
    ESPAÑOL("es"),
    INGLES("en"),
    FRANCES("fr"),
    PORTUGUES("pt");

    private String idiomaGutendex;

    Idioma(String idiomaGutendex){
        this.idiomaGutendex = idiomaGutendex;
    }
    public static Idioma fromString(List<String> text) {
        for (String texto : text) {
            for (Idioma idioma : Idioma.values()) {
                if (idioma.idiomaGutendex.equalsIgnoreCase(texto)) {
                    return idioma;
                }
            }
        }
        throw new IllegalArgumentException("Ningún idioma encontrado en la lista: " + text);
    }

}
