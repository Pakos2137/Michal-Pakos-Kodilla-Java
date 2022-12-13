package com.kodilla.stream.forumuser;

import java.time.LocalDate;

final public class ForumUser {
    private Integer userId;
    private String userName;
    private char sex;
    private LocalDate bornDate;
    private Integer postCount;

    public ForumUser(final Integer userId, final String userName,final char sex, final LocalDate bornDate,final Integer postCount){
        this.userId =  userId;
        this.userName = userName;
        this.sex = sex;
        this.bornDate = bornDate;
        this.postCount = postCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public Integer getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", bornDate=" + bornDate +
                ", postCount=" + postCount +
                '}';
    }
}
