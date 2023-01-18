package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    @Mock
    private Statistics statisticsMock;
    @Test
    public void WhenUsersCount0() {

         Statistics statisticsMock = mock(Statistics.class);
         Calculator calculateAdvStatistics = new Calculator(statisticsMock);

         List<ForumUser> listOf0Users = calculateAdvStatistics.userCount("Pakos");
         int usersCount = calculateAdvStatistics.postsCount();
         assertEquals(0,usersCount);
    }
}
