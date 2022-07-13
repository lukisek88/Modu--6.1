package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistics.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;


    @BeforeEach
    public void beforeEachTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("NAME "+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(80);
       this.forumStatistics = new ForumStatistics();
    }
 @DisplayName("Number of posts 0")
    @Test
    public void testAdvStat0Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPosts());
        assertEquals(0, forumStatistics.getPostsAvgPerUser());
        assertEquals(0, forumStatistics.getCommentsAvgPerPost());

    }
    @DisplayName("Number of posts 1000")
    @Test
    public void testAdvStat1000Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPosts());
        assertEquals(100, forumStatistics.getPostsAvgPerUser());
        assertEquals(0.08, forumStatistics.getCommentsAvgPerPost());
    }
    @DisplayName("Number of comments 0")
    @Test
    public void testAdvStat0Comments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getComments());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser());
        assertEquals(0, forumStatistics.getCommentsAvgPerPost());
    }
    @DisplayName("Number of comments less than posts")
    @Test
    public void testAdvStatLessCommentsThanPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(2);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getPosts());
        assertEquals(2, forumStatistics.getComments());
        assertEquals(1, forumStatistics.getPostsAvgPerUser());
        assertEquals(0.2, forumStatistics.getCommentsAvgPerUser());
        assertEquals(0.2, forumStatistics.getCommentsAvgPerPost());
    }
    @DisplayName("Number of comments bigger than posts")
    @Test
    public void testAdvStatMoreCommentsThanPosts(){
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(40, forumStatistics.getPosts());
        assertEquals(80, forumStatistics.getComments());
        assertEquals(4, forumStatistics.getPostsAvgPerUser());
        assertEquals(8, forumStatistics.getCommentsAvgPerUser());
        assertEquals(2, forumStatistics.getCommentsAvgPerPost());

    }
    @DisplayName("Number of Users 0")
    @Test
    public void testAdvStat0Users(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsers());
        assertEquals(0, forumStatistics.getPostsAvgPerUser());
        assertEquals(0, forumStatistics.getCommentsAvgPerUser());

    }
    @DisplayName("Number of User 100")
    @Test
    public void testAdvStat100Users(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsers());
        assertEquals(0.4, forumStatistics.getPostsAvgPerUser());
        assertEquals(0.8, forumStatistics.getCommentsAvgPerUser());
    }
}