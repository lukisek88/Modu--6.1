package com.kodilla.patterns.strategy.social;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

  @Test
  public void testDefaultSharingStrategies() {

      //Given
      User millennials = new Millenials("John");
      User yGeneration = new YGeneration("Arnold");
      User zGeneration = new ZGeneration("Adam");

      //When
      String facebook = millennials.sharePost();
      String twitter = yGeneration.sharePost();
      String snapchat = zGeneration.sharePost();

      //Then
     assertEquals("Snapchat", snapchat);
     assertEquals("Twitter", twitter);
     assertEquals("Facebook", facebook);
  }
    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millennials = new Millenials("John");
        millennials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millennials.sharePost();

        //Then
       assertEquals("Facebook", facebook);
    }
}