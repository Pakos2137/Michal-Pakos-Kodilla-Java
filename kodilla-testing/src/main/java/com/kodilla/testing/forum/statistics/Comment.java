package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class Comment {
    public String text;
    public String userName;

    public Comment(String text, String userName) {
        this.text = text;
        this.userName = userName;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(text, comment.text) && Objects.equals(userName, comment.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, userName);
    }
}
