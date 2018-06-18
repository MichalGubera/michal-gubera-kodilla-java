package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Ryan Talley", 'M', 1997, 5, 19, 3));
        forumUsers.add(new ForumUser(2, "Phoebe Pearson", 'F', 1971, 3, 4, 12));
        forumUsers.add(new ForumUser(3, "Dylan Murphy", 'M', 1985, 2, 16, 0));
        forumUsers.add(new ForumUser(4, "Morgan Walsh", 'M', 2003, 11, 26, 6));
        forumUsers.add(new ForumUser(5, "Giancarlo Guerrero", 'M', 1980, 1, 26, 1));
        forumUsers.add(new ForumUser(6, "Madelynn Carson", 'F', 2005, 1, 22, 9));
        forumUsers.add(new ForumUser(7, "Aimee Murphy", 'F', 1980, 6, 15, 7));
        forumUsers.add(new ForumUser(8, "Monica GreenWood", 'F', 2000, 4, 3, 2));
        forumUsers.add(new ForumUser(9, "Paul Newman", 'M', 1997, 12, 26, 4));
    }

    public ArrayList<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(forumUsers);
    }
}
