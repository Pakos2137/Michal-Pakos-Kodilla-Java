package com.kodilla.testing.forum.statistics;


public class Calculator {
    private int usersQty;
    private int postQty;
    private int commentQty;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public int getUsersQty() {
        return usersQty;
    }

    public int getPostQty() {
        return postQty;
    }

    public int getCommentQty() {
        return commentQty;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser() {
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost() {
        return avgCommentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQty = statistics.usersNames().size();
        postQty = statistics.postsCount();
        commentQty = statistics.commentsCount();
        avgPostPerUser = calcAvgPostPerUser();
        avgCommentPerUser = calcAvgCommentPerUser();
        avgCommentPerPost = calcAvgCommentPerPost();
    }
    public double calcAvgCommentPerUser() {
        if(commentQty != 0) {
            return usersQty/commentQty;
        } else {
            return 0;
        }

    }
    public double calcAvgCommentPerPost() {
        if(commentQty != 0) {
            return postQty/commentQty;
        } else {
            return 0;
        }

    }
    public double calcAvgPostPerUser() {
        if(commentQty != 0) {
            return usersQty/postQty;
        } else {
            return 0;
        }
    }
    public void showStatistics() {
        System.out.println("Users Quantity: " + usersQty);
        System.out.println("Post Quantity :" + postQty);
        System.out.println("Comment Quantity :" + commentQty);
        System.out.println("Average Comment Per User: " + avgCommentPerUser);
        System.out.println("Average Comment Per Post : " + avgCommentPerPost);
        System.out.println("Average Posts Per User: " + avgPostPerUser);
    }
}