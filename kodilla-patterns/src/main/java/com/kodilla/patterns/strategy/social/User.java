package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    public SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setSocialPublishingStrategy(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
