package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    Calculator calculator;

    @Mock
    private Statistics statisticsMock;

    List<String> userGenerator(int number) {
        List<String> generatedUsers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
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
        Calculator calculator1 = new Calculator();
        mockStatistics(0,2,0);
        calculator1.calculateAdvStatistics(statisticsMock);

        assertEquals(0, calculator.getPostQty());
    }
}
