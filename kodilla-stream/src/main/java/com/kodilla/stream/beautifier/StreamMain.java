package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("welcome to my pretty world", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("welcome to my pretty world", (text) -> text.toUpperCase());
        poemBeautifier.beautify("welcome", (text) -> text.join("--", text, text, text));
        poemBeautifier.beautify("welcomeXXXtoXXXmyXXXprettyXXXworld", (text) -> text.replace('X', 'o'));
        poemBeautifier.beautify("welcome", (text) -> text + text + text);
    }
}
