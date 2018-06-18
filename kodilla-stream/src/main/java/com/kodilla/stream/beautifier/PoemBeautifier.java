package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        String effect = poemDecorator.decorate(text);
        return effect;
    }
}
