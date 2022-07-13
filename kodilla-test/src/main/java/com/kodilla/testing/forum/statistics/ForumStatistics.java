package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numUsers;
    private int numPosts;
    private int numComments;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getUsers() {
        return numUsers;
    }

    public int getPosts() {
        return numPosts;
    }

    public int getComments() {
        return numComments;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }



    public void calculateAdvStatistics(Statistics statistics){
        numUsers = statistics.usersNames().size();
        numPosts = statistics.postsCount();
        numComments = statistics.commentsCount();
        postsAvgPerUser = calculatePostsAvgPerUser();
        commentsAvgPerUser = calculateCommentsAvgPerUser();
        commentsAvgPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(numUsers>0){
            return (double)numPosts/numUsers;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(numUsers>0){
            return (double)numComments/numUsers;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(numPosts>0){
            return (double)numComments/numPosts;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum advanced statistics:");
        System.out.println("Users quantity: " + numUsers);
        System.out.println("Posts quantity: " + numPosts);
        System.out.println("Comments quantity: " + numComments);
        System.out.println("Posts average per user" + postsAvgPerUser);
        System.out.println("Comments average per user" + commentsAvgPerUser);
        System.out.println("Comments average per post" + commentsAvgPerPost);
    }
}