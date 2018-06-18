package com.kodilla.stream.forumuser;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumUserTestSuite {
    @Test
    public void testForumUserStream() {
        //Given
        Forum forum = new Forum();
        Map<Integer, ForumUser> expectedMapUsers = new HashMap<Integer, ForumUser>();
        expectedMapUsers.put(1, new ForumUser(1, "Ryan Talley", 'M', 1997, 5, 19, 3));
        expectedMapUsers.put(5, new ForumUser(5, "Giancarlo Guerrero", 'M', 1980, 1, 26, 1));
        expectedMapUsers.put(9, new ForumUser(9,"Paul Newman", 'M', 1997, 12, 26, 4));
        //When
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(user -> user.getPostsNum() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        //Then
        Assert.assertEquals(expectedMapUsers, theResultMapOfUsers);
    }
}
