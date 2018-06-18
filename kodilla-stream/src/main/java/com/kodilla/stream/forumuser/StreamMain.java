package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
/*      - zainicjować strumień Stream przy pomocy metody stream() kolekcji
        - odfiltrować tylko tych użytkowników, którzy są mężczyznami
        - odfiltrować tylko tych użytkowników, którzy mają co najmniej 20 lat
        - odfiltrować tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
        - przy pomocy kolektora utwórz mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
        - wyświetl otrzymaną mapę wynikową
*/
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getPostsNum() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
