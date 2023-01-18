package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.Objects;

public class ForumUser {
    public String nickName;

    public int userId;

    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<Comment> comments = new ArrayList<>();
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ForumUser(String nickName, int userId) {
        this.nickName = nickName;
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId && Objects.equals(nickName, forumUser.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, userId);
    }
}
