package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    Calculator calculator = new Calculator();


    @Mock
    private Statistics statisticsMock;

    List<String> userGenerator(int number) {
        List<String> generatedUsers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String generatedUser = "User" + 1;
            generatedUsers.add(generatedUser);
        }
        return generatedUsers;
    }
    public void mockStatistics(int numberOfUsers,int numberOfPosts,int numberOfComments) {
        when(statisticsMock.usersNames()).thenReturn(userGenerator(numberOfUsers));
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
    }
    @Test
    public void WhenPostQty0() {
        mockStatistics(0,0,0);
        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(0, calculator.getPostQty());
    }
    @Test
    public void WhenPostQty1000() {
        mockStatistics(0,1000,0);
        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(1000,calculator.getPostQty());
    }
    @Test
    public void WhenCommentQty0() {
        mockStatistics(0,0,0);
        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(0,calculator.getCommentQty());
    }
    @Test
    public void WhenCommentQtySmallerThanPostQty() {
        mockStatistics(0,20,10);
        calculator.calculateAdvStatistics(statisticsMock);

        assertTrue(calculator.getCommentQty() < calculator.getPostQty());
    }
    @Test
    public void WhenCommentQtyBiggerThanPostQty() {
        mockStatistics(0,10,20);
        calculator.calculateAdvStatistics(statisticsMock);

        assertTrue(calculator.getCommentQty() > calculator.getPostQty());
    }
    @Test
    public void WhenUsersQty0() {
        mockStatistics(0,0,0);
        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(0,calculator.getUsersQty());
    }
    @Test
    public void WhenUsersQty100() {
        mockStatistics(100, 0, 0);
        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(100, calculator.getUsersQty());
    }
}
