package com.kodilla.stream.beautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Piękne zdanie nr1.", (a) -> "ABC " + a + " ABC");
        beautifier.beautify("Zdanie z mayLych Literek", (a) -> a.toUpperCase());
        beautifier.beautify("Jednak nie wszyskie polskie znaki działają", (a) -> ">>" + a + "<<");
        beautifier.beautify("Po 9 tygodniach dalej nie rozumiem intefejsow", (a) -> "UWAGA!!! " + a + " UWAGA!!!");

    }
}