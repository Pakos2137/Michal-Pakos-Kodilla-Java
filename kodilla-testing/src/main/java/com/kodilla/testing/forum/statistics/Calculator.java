package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    Statistics statistics;

    public Calculator(Statistics statistics) {
        this.statistics = statistics;
    }
    public List<ForumUser>userCount(String usersNames) {
        List<ForumUser> forumUserList = new ArrayList<>();
        int count = forumUserList.size();
        return forumUserList;
    }
    int postsCount() {
        List<ForumUser> forumUserList = new ArrayList<>();
        return forumUserList.size();
    }
}
