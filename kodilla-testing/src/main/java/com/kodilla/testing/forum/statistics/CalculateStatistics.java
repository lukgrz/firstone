package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    private Statistics statistics;
    private double numberPostsPerUser;
    private double numberCommentsPerUser;
    private double numberCommentsPerPost;


    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public double getNumberPostsPerUser() {
        return numberPostsPerUser;
    }

    public double getNumberCommentsPerUser() {
        return numberCommentsPerUser;
    }

    public double getNumberCommentsPerPost() {
        return numberCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double numberOfUsers = statistics.userNames().size();
        double numberOfPosts = statistics.postsCount();
        double numberOfComments = statistics.commentsCount();

        if (numberOfPosts == 0) {
            numberPostsPerUser = numberOfPosts / numberOfUsers;
            numberCommentsPerUser = numberOfComments / numberOfUsers;
            numberCommentsPerPost = 0;
        } else if (numberOfUsers == 0) {
            numberPostsPerUser = 0;
            numberCommentsPerUser = 0;
            numberCommentsPerPost = numberOfComments / numberOfPosts;
        } else {
            numberPostsPerUser = numberOfPosts / numberOfUsers;
            numberCommentsPerUser = numberOfComments / numberOfUsers;
            numberCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

}