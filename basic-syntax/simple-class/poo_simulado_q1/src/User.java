package poo_simulado_q1.src;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String twitterId;
    private List<Tweet> tweets;
    private VerifiedUser verifiedUser;

    public User(String twitterId, LocalDate verificationDate){
        this.twitterId = twitterId;
        this.tweets = new LinkedList<>();
        this.verifiedUser = new VerifiedUser(verificationDate);
    }
    
    public String getTwitterId() {
        return twitterId;
    }
    public List<Tweet> getTweets() {
        return tweets;
    }

    public void addTweet(Tweet tweet){
        this.tweets.add(tweet);
    }

    public Boolean isVerified() {
        if(this.verifiedUser.getVerificationDate() == null)
            return false;
        return true;
    }
}
