package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class MainStreamToForumUser {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, Object> mapForumUser = theForum.getForumUser().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                //.filter(forumUser -> forumUser.getBornDate(), LocalDate.now().getYear() >= 20)
                .filter(forumUser -> forumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        mapForumUser.entrySet().stream()
                .map(entry -> entry.getKey() +":" + entry.getValue())
                .forEach(System.out::println);
    }
}
