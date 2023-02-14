package com.kodilla.good.patterns.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUser = new ArrayList<>();

    public Forum() {
        forumUser.add(new ForumUser(1,"Pakos",'M', LocalDate.of(2004,5,14),0));
        forumUser.add(new ForumUser(2,"Kaczka",'M', LocalDate.of(1939,9,1),11));
        forumUser.add(new ForumUser(3,"Żabka",'F', LocalDate.of(11,11,11),4));
        forumUser.add(new ForumUser(4,"Kita",'F', LocalDate.of(1353,6,14),5));
        forumUser.add(new ForumUser(5,"Lysy",'M', LocalDate.of(2010,10,23),31));
        forumUser.add(new ForumUser(6,"Zbiaks",'M', LocalDate.of(5232,12,14),30));
        forumUser.add(new ForumUser(7,"Programista",'M', LocalDate.of(1111,1,14),25));
        forumUser.add(new ForumUser(8,"Informatyk",'F', LocalDate.of(4444,8,14),21));
        forumUser.add(new ForumUser(9,"Gniewomir Paprotka",'F', LocalDate.of(2137,4,9),6));
        forumUser.add(new ForumUser(10,"Biednar",'M', LocalDate.of(420,7,14),18));
    }
    public List<ForumUser> getForumUser() {
        return new ArrayList<>(forumUser);
    }
}
