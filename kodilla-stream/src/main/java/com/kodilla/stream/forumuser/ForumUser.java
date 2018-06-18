package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer id;
    private final String name;
    private final Character sex;
    private final LocalDate birthDate;
    private final Integer postsNum;

    public ForumUser(final Integer id, final String name, final Character sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final Integer postsNum) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNum = postsNum;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getPostsNum() {
        return postsNum;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNum=" + postsNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != null ? !id.equals(forumUser.id) : forumUser.id != null) return false;
        if (name != null ? !name.equals(forumUser.name) : forumUser.name != null) return false;
        if (sex != null ? !sex.equals(forumUser.sex) : forumUser.sex != null) return false;
        if (birthDate != null ? !birthDate.equals(forumUser.birthDate) : forumUser.birthDate != null) return false;
        return postsNum != null ? postsNum.equals(forumUser.postsNum) : forumUser.postsNum == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (postsNum != null ? postsNum.hashCode() : 0);
        return result;
    }
}
