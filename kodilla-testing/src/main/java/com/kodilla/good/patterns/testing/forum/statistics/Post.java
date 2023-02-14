package com.kodilla.good.patterns.testing.forum.statistics;

import java.util.Objects;

public class Post {
    public String text;

    public String userName;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Post(String text, String userName) {
        this.text = text;
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(text, post.text) && Objects.equals(userName, post.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, userName);
    }
    
}
